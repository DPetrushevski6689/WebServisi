package com.example.Resources;

import java.util.List;

import com.example.Models.User;
import com.example.Services.UsersService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
public class UsersResource {

    UsersService userService = new UsersService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GET
    @Path("/{userId}")
    @Produces(MediaType.TEXT_PLAIN)
    public User getMessage(@PathParam("userId") Long userId) {
        return userService.getUser(userId);
    }
}
