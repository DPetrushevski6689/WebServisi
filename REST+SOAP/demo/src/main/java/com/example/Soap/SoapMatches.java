package com.example.Soap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.example.Models.FilterHelper;
import com.example.Models.Match;
import com.example.Models.MatchHelper;
import com.example.Models.MatchID;
import com.example.Models.MatchPojo;
import com.example.Models.MatchesPojo;
import com.example.Models.SoapResponse;
import com.example.Services.MatchService;

import jakarta.ws.rs.NotFoundException;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class SoapMatches {
    private MatchService matchService = new MatchService();

    @WebMethod(action = "get_all_matches", operationName = "GetAllMatches")
    @WebResult(partName = "Matches List", name = "MatchesPojo")
    public MatchesPojo GetAllMatches() {

        List<Match> matchesList = matchService.getAllMatches();
        MatchesPojo pojo = new MatchesPojo();
        if (matchesList.size() == 0) {
            List<Match> list = new ArrayList<>();
            pojo.setMatches(list);
            return pojo;
        }
        pojo.setMatches(matchesList);
        return pojo;
    }

    @WebMethod(action = "get_all_matches_filtered", operationName = "GetAllMatchesFiltered")
    @WebResult(partName = "Matches list", name = "MatchesPojo")
    public MatchesPojo GetAllMatchesFiltered(@WebParam(partName = "filter", name = "FilterModel") FilterHelper filter) {
        MatchesPojo pojo = new MatchesPojo();
        List<Match> matchesList = new ArrayList<>();
        String type = filter.getType().trim().toLowerCase();

        if (type.equals("status")) {
            matchesList = matchService.getAllMatchesForStatus(type);
        } else if (type.equals("type")) {
            matchesList = matchService.getAllMatchesForType(type);
        } else if (type.equals("team")) {
            matchesList = matchService.getAllMatchesForTeam(type);
        } else {
            matchesList = matchService.getAllMatches();
        }
        pojo.setMatches(matchesList);
        return pojo;
    }

    @WebMethod(action = "get_match_byId", operationName = "GetMatchById")
    @WebResult(partName = "Match", name = "MatchPojo")
    public MatchPojo getMatchByIdSoap(@WebParam(partName = "matchId", name = "MatchID") MatchID matchId) {

        long id = Long.valueOf(matchId.getId());
        Match match = matchService.getMatchForId(id);
        if (match == null) {
            throw new NotFoundException();
        } else {
            MatchPojo matchPojo = new MatchPojo(match.getId(), match.getName(), match.getType(), match.getStatus(),
                    match.getDateScheduled(), match.getDateFinished(), match.getCity(), match.getStadium(),
                    match.getScore());
            return matchPojo;
        }
    }

    @WebMethod(action = "add_match", operationName = "AddMatch")
    @WebResult(partName = "Result", name = "SoapResponse")
    public SoapResponse postMatch(@WebParam(partName = "MatchInput", name = "MatchPojo") MatchPojo match)
            throws Exception {
        if ((match.getName() == "") || (match.getCity() == "") || (match.getDateFinished() == "")
                || (match.getDateScheduled() == "") || (match.getScore() == "") || (match.getStadium() == "")
                || (match.getStatus().toString() == "")) {
            throw new Exception("Invalid input. All fields must have values");
        }

        MatchHelper MatchtoAdd = new MatchHelper(matchService.getAllMatches().size() + 1, match.getName(),
                match.getType(), match.getStatus().toString(), match.getDateScheduled(), match.getDateFinished(),
                match.getCity(), match.getStadium(), match.getScore());

        Match matchAdded = matchService.addMatch(MatchtoAdd);
        if (matchAdded == null) {
            throw new Exception("Adding match error");
        } else {
            return new SoapResponse("Match with Id=" + matchAdded.getId() + " has been added to the database.");
        }

    }

    @WebMethod(action = "update_match", operationName = "UpdateMatch")
    @WebResult(partName = "Result", name = "SoapResponse")
    public SoapResponse updateMatch(@WebParam(partName = "MatchInput", name = "MatchPojo") MatchPojo match)
            throws Exception {
        if ((match.getName() == "") || (match.getCity() == "") || (match.getDateFinished() == "")
                || (match.getDateScheduled() == "") || (match.getScore() == "") || (match.getStadium() == "")
                || (match.getStatus().toString() == "")) {
            throw new Exception("Invalid input. All fields must have values");
        }
        MatchHelper updatedMatch = new MatchHelper(match.getId(), match.getName(), match.getType(),
                match.getStatus().toString(), match.getDateScheduled(), match.getDateFinished(), match.getCity(),
                match.getStadium(), match.getScore());
        Match matchRet = matchService.updateMatch(updatedMatch);
        if (matchRet == null) {
            throw new Exception("The movie with Id=" + matchRet.getId() + " does not exist in the database.");
        } else {
            return new SoapResponse("Movie with Id=" + matchRet.getId() + " has been updated.");
        }
    }

    @WebMethod(action = "delete_match", operationName = "DeleteMatch")
    @WebResult(partName = "Result", name = "SoapResponse")
    public SoapResponse deleteMatch(@WebParam(partName = "matchId", name = "MatchID") MatchID matchId)
            throws Exception {
        long id = Long.valueOf(matchId.getId());
        Match result = matchService.removeMatch(id);
        if (result == null) {
            return new SoapResponse("Movie with Id=" + id + " has been deleted.");
        } else {
            throw new Exception("The movie with Id=" + id + " does not exist in the database.");
        }
    }

}
