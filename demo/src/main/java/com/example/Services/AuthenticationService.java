package com.example.Services;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import com.example.Database.Database;
import com.example.Models.Authenticator;
import com.example.Models.PassHasher;
import com.example.Models.User;

public class AuthenticationService {
    public static Map<Long, User> users = Database.getAllUsers();
    public static Map<Long, Authenticator> sessions = Database.getSessions();
    private static final int ITERATIONS = 10000;
    private static final int KEY_LENGTH = 256;

    public AuthenticationService() {
    }

    // 0 -> doesnt exist 1 -> wrong combination userId->login success
    public User authenticate(String username, String password) // ako ne vrati null, togas prodolzi so issueSecureToken
    {
        int i = users.size();
        if (i == 0) {
            return null;
        }
        User us = null;
        for (int j = 1; j <= i; j++) {
            us = users.get(new Long(j));
            if (us.getUsername() == username) {
                break;
            }

        }
        boolean ver = PassHasher.verifyUserPassword(password, us.getPassword(), username);
        if (ver) {
            return us;
        } else {
            return null;
        }
    }

    public String issueSecureToken(User user) {
        String returnValue = null;
        String newSaltAsPostfix = user.getUsername();
        String accessTokenMaterial = user.getId() + newSaltAsPostfix;
        byte[] encryptedAccessToken = null;
        try {
            encryptedAccessToken = encrypt(user.getPassword(), accessTokenMaterial);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        String encryptedAccessTokenBase64Encoded = Base64.getEncoder().encodeToString(encryptedAccessToken);
        String tokenToSaveToDatabase = encryptedAccessTokenBase64Encoded;
        Authenticator details = new Authenticator(user.getId(), tokenToSaveToDatabase);
        details.setUserId(user.getId());
        sessions.put(details.getUserId(), details);
        returnValue = user.getId() + " " + encryptedAccessTokenBase64Encoded;
        return returnValue;
    }

    public User getLoggedUserFromToken(long userId, String token) {
        Authenticator dets = sessions.get(userId);
        if (dets == null) {
            return null;
        }
        if (dets.getToken().equals(token)) {
            return users.get(userId);
        } else {
            return null;
        }
    }

    public void deleteSecureToken(long userId, String token) // pri logout
    {
        Authenticator dets = sessions.get(userId);
        if (dets.getToken() == dets.getToken())
            ;
        {
            sessions.remove(userId);
        }
    }

    public boolean isValidToken(long userId, String token) {
        Authenticator dets = sessions.get(userId);
        if (dets.getToken() == token) {
            return true;
        } else {
            return false;
        }
    }

    public byte[] encrypt(String securePassword, String accessTokenMaterial) throws InvalidKeySpecException {
        return hash(securePassword.toCharArray(), accessTokenMaterial.getBytes());
    }

    private byte[] hash(char[] password, byte[] salt) throws InvalidKeySpecException {
        PBEKeySpec spec = new PBEKeySpec(password, salt, ITERATIONS, KEY_LENGTH);
        Arrays.fill(password, Character.MIN_VALUE);
        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            return skf.generateSecret(spec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new AssertionError("Error while hashing a password: " + e.getMessage(), e);
        } finally {
            spec.clearPassword();
        }
    }
}
