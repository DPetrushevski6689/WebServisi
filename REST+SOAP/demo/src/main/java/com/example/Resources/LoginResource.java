package com.example.Resources;

import java.security.NoSuchAlgorithmException;
import java.util.Map;

import com.example.Database.Database;
import com.example.Models.RegisterClass;
import com.example.Models.User;
import com.example.Services.AuthenticationService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

@Path("/login")
public class LoginResource {

    private AuthenticationService authService = new AuthenticationService();

    public static Map<Long, User> users = Database.getAllUsers();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String loginUser(@Context UriInfo uri) {

        MultivaluedMap<String, String> queryParams = uri.getQueryParameters();

        String userName = queryParams.getFirst("username");
        String password = queryParams.getFirst("password");

        User userStatus = authService.authenticate(userName, password);

        if (userStatus == null) { // doesn't exist -> register
            return "Wrong combination";
        } else { // exists
            String token = authService.issueSecureToken(userStatus);
            return "Login success";
        }

    }
}
