package com.example.Resources;

import java.util.Base64;
import java.util.List;
import java.util.StringTokenizer;

import com.example.Models.Authenticator;
import com.example.Services.AuthenticationService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/out")
public class LogoutResource {
    private AuthenticationService authService = new AuthenticationService();
    private static final String AUTHORIZATION_HEADER_KEY = "Authorization";
    private static final String AUTHORIZATION_HEADER_PREFIX = "Basic ";

    @POST
    @Path("/logout")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String logout(@Context HttpHeaders headers) {
        List<String> authHeader = headers.getRequestHeaders().get(AUTHORIZATION_HEADER_KEY);
        String authToken = authHeader.get(0);
        authToken = authToken.replace(AUTHORIZATION_HEADER_PREFIX, "");
        String decoded = Base64.getDecoder().decode(authToken).toString();
        StringTokenizer tokenizer = new StringTokenizer(decoded, ":");
        String userId = tokenizer.nextToken();
        String token = tokenizer.nextToken();
        long id = Long.valueOf(userId);
        authService.deleteSecureToken(id, token);
        return "Logged out";
    }
}
