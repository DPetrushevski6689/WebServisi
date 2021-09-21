package com.example.Services;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.Database.Database;
import com.example.Models.PassHasher;
import com.example.Models.User;

public class UsersService {

    private Map<Long, User> users = Database.getAllUsers();

    public UsersService() {
    }

    public List<User> getAllUsers() {
        return new ArrayList<User>(users.values());
    }

    public User getUser(long userId) {
        return users.get(userId);
    }

    public User addUser(String username, String password) {
        int size = users.size();
        if (size > 0) {
            for (int i = 1; i <= size; i++) {
                Long index = new Long(i);
                User us = users.get(index);
                if (us.getUsername().equals(username)) {
                    return null;
                }
            }
        }

        String hashedPassword = PassHasher.generateSecurePassword(password, username);
        User user = new User(users.size() + 1, username, hashedPassword);
        users.put(user.getId(), user);
        return user;
    }

    public User updateUser(String password, String oldPassword, long userId) throws NoSuchAlgorithmException {
        User user = users.get(userId);
        if (user.equals(null)) {
            return null;
        }
        if (PassHasher.verifyUserPassword(oldPassword, user.getPassword(), user.getUsername())) {
            String hashedPassword = PassHasher.generateSecurePassword(password, user.getUsername());
            user.setPassword(hashedPassword);
            users.put(userId, user);
            return user;
        } else {
            return null;
        }
    }

    public void deleteUser(long userId) {
        users.remove(userId);
    }

    public User getUserForUsername(String username) {
        int size = users.size();
        User user = null;
        if (size > 0) {
            for (int i = 1; i <= size; i++) {
                Long index = new Long(i);
                User us = users.get(index);
                if (us.getUsername().equals(username)) {
                    user = users.get(index);
                    return user;
                }
            }
        }
        return null;
    }
}
