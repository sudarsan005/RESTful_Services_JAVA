package org.sudarsan.restful.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sudarsan.restful.message.model.Message;
import org.sudarsan.restful.message.service.MessageService;

@Path ("/messages")
public class MessageResource {
	
	MessageService ms=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage()
	{	
		return ms.getAllMessages();
	}
}
