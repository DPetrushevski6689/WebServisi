package com.example.Resources;

import com.example.Models.User;
import com.example.Services.UsersService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.UriInfo;

@Path("/unregister")
public class UnregisterResource {
    private UsersService userService = new UsersService();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String unRegisterUser(@Context UriInfo uri) {

        MultivaluedMap<String, String> queryParams = uri.getQueryParameters();

        String userName = queryParams.getFirst("username");
        String password = queryParams.getFirst("password");
        String newPassword = queryParams.getFirst("newPassword");

        User userToDelete = null;

        if (userName != null && password != null && newPassword != null) {
            userToDelete = userService.getUserForUsername(userName);
        } else {
            return "Error: Please provide username both password and new password";
        }

        if (password.equals(newPassword)) {
            userService.deleteUser(userToDelete.getId());
        } else {
            return "Error: Passwords dont match";
        }

        User checkUser = userService.getUser(userToDelete.getId());

        if (checkUser == null) {
            return "Successfully deleted user!";
        } else {
            return "Error deleting user";
        }

    }
}
