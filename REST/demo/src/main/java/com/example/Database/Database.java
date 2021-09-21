package com.example.Database;

import java.util.HashMap;
import java.util.Map;

import com.example.Models.Authenticator;
import com.example.Models.Match;
import com.example.Models.Message;
import com.example.Models.User;

public class Database {

    private static Map<Long, Message> messages = new HashMap<Long, Message>();

    private static Map<Long, User> users = new HashMap<>();

    private static Map<Long, Authenticator> sessions = new HashMap<>();

    private static Map<Long, Match> matches = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<Long, User> getAllUsers() {
        return users;
    }

    public static Map<Long, Authenticator> getSessions() {
        return sessions;
    }

    public static Map<Long, Match> getMatches() {
        return matches;
    }
}
