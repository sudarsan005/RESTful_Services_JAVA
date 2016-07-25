package org.sudarsan.restful.message.service;

import java.util.ArrayList;
import java.util.List;

import org.sudarsan.restful.message.model.Message;


public class MessageService {
	
	public List<Message> getAllMessages()
	{
		List<Message> mList=new ArrayList<>();
		Message m1=new Message(1L,"Hey There","Sud");
		Message m2=new Message(2L,"Hey There","Sud");
		mList.add(m1);
		mList.add(m2);
		return mList;
	}
	

}
