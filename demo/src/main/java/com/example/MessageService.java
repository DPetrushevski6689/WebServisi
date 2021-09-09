package com.example;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.example.Database.Database;
import com.example.Models.Message;

public class MessageService {

    private Map<Long, Message> messages = Database.getMessages();

    public MessageService() {
        messages.put(1L, new Message(1, "Hello World", "Tom"));
        messages.put(2L, new Message(2, "Hello World2", "Mark"));
    }

    public List<Message> getAllMessages() {
        return new ArrayList<Message>(messages.values());
    }

    public List<Message> getAllMessagesForYear(int year) {
        List<Message> msgsForYear = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        for (Message message : messages.values()) {
            cal.setTime(message.getCreated());
            if (cal.get(Calendar.YEAR) == year) {
                msgsForYear.add(message);
            }
        }
        return msgsForYear;
    }

    public Message getMessage(long Id) {
        return messages.get(Id);
    }

    public Message addMessage(Message message) {
        message.setId(messages.size() + 1);
        messages.put(message.getId(), message);
        return message;
    }

    public Message updateMessage(Message message) {
        if (message.getId() <= 0) {
            return null;
        }
        messages.put(message.getId(), message);
        return message;
    }

    public Message removeMessage(long Id) {
        return messages.remove(Id);
    }
}
