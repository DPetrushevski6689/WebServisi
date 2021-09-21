package com.example.Resources;

import java.net.URI;
import java.security.NoSuchAlgorithmException;

import com.example.Database.Database;
import com.example.Models.RegisterClass;
import com.example.Models.User;
import com.example.Services.UsersService;

import org.glassfish.jersey.server.Uri;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.core.Response.StatusType;

@Path("/register")
public class RegisterResource {

    private UsersService userService = new UsersService();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String registerUser(@Context UriInfo uri) {

        MultivaluedMap<String, String> queryParams = uri.getQueryParameters();

        String userName = queryParams.getFirst("username");
        String password = queryParams.getFirst("password");

        User userAdded = userService.addUser(userName, password);

        if (userAdded == null) {
            return "Error: User: " + userName + " already exists.";
        } else {
            return "Success!";
        }

    }
}
