package com.example.Resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import javax.print.attribute.standard.Media;

import com.example.Models.Message;
import com.example.Services.MessageService;

@Path("/message")
public class MessageResource {

    MessageService mess = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages(@QueryParam("year") int year) {
        return mess.getAllMessages();
        /*
         * if (year > 0) { //return mess.getAllMessagesForYear(year); } else { return
         * mess.getAllMessages(); }
         */
    }

    @GET
    @Path("/{messageId}")
    @Produces(MediaType.TEXT_PLAIN)
    public Message getMessage(@PathParam("messageId") Long messageId) {
        return mess.getMessage(messageId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message addMessage(Message message) {
        return mess.addMessage(message);
    }

    @PUT
    @Path("/{messageId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message updateMessage(@PathParam("messageId") Long id, Message message) {
        message.setId(id);
        return mess.updateMessage(message);
    }

    @DELETE
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteMessage(@PathParam("messageId") Long id) {
        mess.removeMessage(id);
    }
}
