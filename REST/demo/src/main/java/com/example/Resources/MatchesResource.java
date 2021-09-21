package com.example.Resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.Database.Database;
import com.example.Models.Match;
import com.example.Models.MatchHelper;
import com.example.Services.MatchService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/matches")
public class MatchesResource {

    private MatchService matchService = new MatchService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Match> getMatches(@QueryParam("type") String type, @QueryParam("status") String status) {
        List<Match> matches = matchService.getAllMatches();

        List<Match> finalMatches = new ArrayList<>();

        if ((type == null) && (status == null)) {
            for (Match i : matches) {
                Map<Long, Match> matchesMap = Database.getMatches();
                Match toAdd = matchesMap.get(i.getId());
                finalMatches.add(toAdd);
            }
            return finalMatches;
        } else if ((type != null) && (status == null)) {
            return matchService.getAllMatchesForType(type);
        } else if ((type == null) && (status != null)) {
            return matchService.getAllMatchesForStatus(status);
        } else if ((type != null) && (status != null)) {
            return matchService.getAllMatchesForTypeandStatus(type, status);
        } else {
            return matches;
        }
    }

    @GET
    @Path("/{matchId}")
    @Produces(MediaType.TEXT_PLAIN)
    public Match getMatch(@PathParam("matchId") Long matchId) {
        return matchService.getMatchForId(matchId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Match addMatch(MatchHelper match) {
        return matchService.addMatch(match);
    }

    @DELETE
    @Path("/{matchId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteMatch(@PathParam("matchId") Long id) {
        matchService.removeMatch(id);
    }

    @PUT
    @Path("/{matchId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Match updateMatch(@PathParam("matchId") Long id, MatchHelper match) {
        match.setId(id);
        return matchService.updateMatch(match);
    }

}