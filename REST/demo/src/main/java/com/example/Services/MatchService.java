package com.example.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.Database.Database;
import com.example.Models.Match;
import com.example.Models.MatchHelper;
import com.example.Models.Match.Status;

public class MatchService {

    private Map<Long, Match> matches = Database.getMatches();

    public MatchService() {
        matches.put(1L, new Match("Real Madrid vs Chelsea", "Football", Status.ended, "14/03/1999", "14/03/2021",
                "Skopje", "Boris Trajkovski", "3:1", 1));
    }

    /* ........ */

    public List<Match> getAllMatches() {
        return new ArrayList<Match>(matches.values());
    }

    public Match getMatchForId(long Id) {
        return matches.get(Id);
    }

    public Match addMatch(MatchHelper match) {

        Match newMatch = new Match();

        newMatch.setId(matches.size() + 1);
        newMatch.setName(match.getName());
        newMatch.setType(match.getType());
        if (match.getStatus().equals(Status.active.toString())) {
            newMatch.setStatus(Status.active);
        } else if (match.getStatus().equals(Status.scheduled.toString())) {
            newMatch.setStatus(Status.scheduled);
        } else {
            newMatch.setStatus(Status.ended);
        }
        newMatch.setDateScheduled(match.getDateScheduled());
        newMatch.setDateFinished(match.getDateFinished());
        newMatch.setCity(match.getCity());
        newMatch.setStadium(match.getStadium());
        newMatch.setScore(match.getScore());
        matches.put(newMatch.getId(), newMatch);
        return newMatch;
    }

    public Match updateMatch(MatchHelper match) {
        if (match.getId() <= 0) {
            return null;
        }
        Match updatedMatch = new Match();

        updatedMatch.setId(match.getId());
        updatedMatch.setName(match.getName());
        updatedMatch.setType(match.getType());
        if (match.getStatus().equals(Status.active.toString())) {
            updatedMatch.setStatus(Status.active);
        } else if (match.getStatus().equals(Status.scheduled.toString())) {
            updatedMatch.setStatus(Status.scheduled);
        } else {
            updatedMatch.setStatus(Status.ended);
        }
        updatedMatch.setDateScheduled(match.getDateScheduled());
        updatedMatch.setDateFinished(match.getDateFinished());
        updatedMatch.setCity(match.getCity());
        updatedMatch.setStadium(match.getStadium());
        updatedMatch.setScore(match.getScore());

        matches.put(updatedMatch.getId(), updatedMatch);
        return updatedMatch;
    }

    public Match removeMatch(long Id) {
        return matches.remove(Id);
    }

    public List<Match> getAllMatchesForType(String type) {
        List<Match> matchesForType = new ArrayList<>();
        for (Match m : matches.values()) {
            if (m.getType().equals(type)) {
                matchesForType.add(m);
            }
        }
        return matchesForType;
    }

    public List<Match> getAllMatchesForStatus(String status) {
        List<Match> matchesForStatus = new ArrayList<>();

        if (status.equals(Status.active.toString()) || status.equals(Status.scheduled.toString())
                || status.equals(Status.ended.toString())) {
            for (Match m : matches.values()) {
                if (m.getStatus().toString().equals(status)) {
                    matchesForStatus.add(m);
                }
            }
        }
        return matchesForStatus;
    }

    public List<Match> getAllMatchesForTypeandStatus(String type, String status) {
        List<Match> matchesForStatus = new ArrayList<>();

        if (status.equals(Status.active.toString()) || status.equals(Status.scheduled.toString())
                || status.equals(Status.ended.toString())) {
            for (Match m : matches.values()) {
                if ((m.getStatus().toString().equals(status)) && (m.getType().equals(type))) {
                    matchesForStatus.add(m);
                }
            }
        }
        return matchesForStatus;
    }
}
