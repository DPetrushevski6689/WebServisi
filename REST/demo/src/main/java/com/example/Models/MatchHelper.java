package com.example.Models;

public class MatchHelper {
    private long Id;
    private String Name;
    private String Type;
    private String Status;
    private String DateScheduled;
    private String DateFinished;
    private String City;
    private String Stadium;
    private String Score;

    public MatchHelper() {
    }

    public MatchHelper(long id, String name, String type, String status, String dateScheduled, String dateFinished,
            String city, String stadium, String score) {
        Id = id;
        Name = name;
        Type = type;
        Status = status;
        DateScheduled = dateScheduled;
        DateFinished = dateFinished;
        City = city;
        Stadium = stadium;
        Score = score;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDateScheduled() {
        return DateScheduled;
    }

    public void setDateScheduled(String dateScheduled) {
        DateScheduled = dateScheduled;
    }

    public String getDateFinished() {
        return DateFinished;
    }

    public void setDateFinished(String dateFinished) {
        DateFinished = dateFinished;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStadium() {
        return Stadium;
    }

    public void setStadium(String stadium) {
        Stadium = stadium;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

}
