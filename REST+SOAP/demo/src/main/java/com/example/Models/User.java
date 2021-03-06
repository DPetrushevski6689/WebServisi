package com.example.Models;

public class User {
    private long Id;
    private String username;
    private String password;

    public User(long id, String username, String password) {
        Id = id;
        this.username = username;
        this.password = password;
    }
    

    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
