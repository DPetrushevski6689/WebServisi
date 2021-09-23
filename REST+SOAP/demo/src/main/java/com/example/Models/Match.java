package com.example.Models;

public class Match {
    public enum Status {
        ended, active, scheduled
    }

    private long Id;
    private String Name;
    private String Type;
    private Status Status;
    private String DateScheduled;
    private String DateFinished;
    private String City;
    private String Stadium;
    private String Score;

    public Match() {
    }

    public Match(String Name, String Type, Status Status, String DateScheduled, String DateFinished, String City,
            String Stadium, String Score, long Id) {
        this.Name = Name;
        this.Type = Type;
        this.Status = Status;
        this.DateScheduled = DateScheduled;
        this.DateFinished = DateFinished;
        this.City = City;
        this.Stadium = Stadium;
        this.Score = Score;
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status Status) {
        this.Status = Status;
    }

    public String getDateScheduled() {
        return DateScheduled;
    }

    public void setDateScheduled(String DateScheduled) {
        this.DateScheduled = DateScheduled;
    }

    public String getDateFinished() {
        return DateFinished;
    }

    public void setDateFinished(String DateFinished) {
        this.DateFinished = DateFinished;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getStadium() {
        return Stadium;
    }

    public void setStadium(String Stadium) {
        this.Stadium = Stadium;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String Score) {
        this.Score = Score;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

}
