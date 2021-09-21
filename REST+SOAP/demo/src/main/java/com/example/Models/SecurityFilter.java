package com.example.Models;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.StringTokenizer;

import com.example.Services.AuthenticationService;

import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.Provider;

@Provider
public class SecurityFilter implements ContainerRequestFilter {

    private static final String AUTHORIZATION_HEADER_KEY = "Authorization";
    private static final String AUTHORIZATION_HEADER_PREFIX = "Basic ";
    private static final String SECURED_URL_PREFIX = "secured";
    private AuthenticationService authService = new AuthenticationService();

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        if (requestContext != null) {
            if (requestContext.getUriInfo().getPath().contains(SECURED_URL_PREFIX)) {
                List<String> authHeader = requestContext.getHeaders().get(AUTHORIZATION_HEADER_KEY);
                if ((authHeader != null)) {
                    if (authHeader.size() > 0) {
                        String authToken = authHeader.get(0);
                        authToken = authToken.replace(AUTHORIZATION_HEADER_PREFIX, "");
                        String decoded = Base64.getDecoder().decode(authToken).toString();
                        StringTokenizer tokenizer = new StringTokenizer(decoded, ":");
                        String userId = tokenizer.nextToken();
                        String token = tokenizer.nextToken();
                        long id = Long.valueOf(userId);
                        User user = authService.getLoggedUserFromToken(id, token);
                        if (user == null) {
                            Response unauthorizedStatus = Response.status(Response.Status.UNAUTHORIZED)
                                    .entity("A wrong token and ID combination has been provided").build();
                            requestContext.abortWith(unauthorizedStatus);
                        } else {
                            return;
                        }
                    } else {
                        Response unauthorizedStatus = Response.status(Response.Status.UNAUTHORIZED)
                                .entity("You must provide your ID and authorization token to view this resource.")
                                .build();
                        requestContext.abortWith(unauthorizedStatus);
                    }
                } else {
                    Response unauthorizedStatus = Response.status(Response.Status.UNAUTHORIZED)
                            .entity("You must provide your ID and authorization token to view this resource.").build();
                    requestContext.abortWith(unauthorizedStatus);
                }
            }
        }
    }

}
