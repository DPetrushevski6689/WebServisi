package com.example.Models;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Matches")
@XmlAccessorType(XmlAccessType.FIELD)
public class MatchesPojo {

    @XmlElementWrapper(name = "Matches")
    @XmlElement(name = "Match")
    private List<Match> matches;

    public MatchesPojo() {
    }

    public List<Match> getMatches() {
        return this.matches;
    }

    public void setMatches(List<Match> matchesList) {
        this.matches = matchesList;
    }

}
