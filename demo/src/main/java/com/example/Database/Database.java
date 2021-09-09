package com.example.Database;

import java.util.HashMap;
import java.util.Map;

import com.example.Models.Message;

public class Database {

    private static Map<Long, Message> messages = new HashMap<Long, Message>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }

}
