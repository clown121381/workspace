package com.user;

import java.io.Serializable;
import java.util.List;

import com.message.Message;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String password;
	private String flag;
	private List<Message> messages;
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	@Override
	public String toString() {
		return "User [flag=" + flag + ", id=" + id + ", password=" + password + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
