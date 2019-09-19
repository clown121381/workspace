package com.spring.service;

import java.util.List;

import com.spring.bean.Admin;
import com.spring.bean.Message;


public interface NoteBookService {
	
	public Admin findUser(String username);
	
	public List<Message> findAllMess();

	public boolean addMessage(Message message);

	public Message findMess(Integer mid);

	public boolean updateMess(Message message);

	public boolean deleteMess(Integer mid);

	public List<Message> findMessByMore(Message message);
}
