package org.sudarsan.restful.message.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private Long id;
	private String message;
	private String author;
	private Date created;
	private Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Message(Long id, String message, String author) {
		//super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = new Date();
	}
	public Message() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
}
