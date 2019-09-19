package com.message.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mapper.MessageMapper;
import com.message.Message;

import MybatisUtil.Mybatis_Util;

public class MessageDao {
	SqlSession session = Mybatis_Util.getSqlSession(true);
	MessageMapper m = session.getMapper(MessageMapper.class);
	
	
	public List<Message> finAllMessage() {
		return m.findAllMessage();
	}
	
	public void deleteMessage(int mid) {
		m.deleteMessage(mid);
	}
	
	public void addMessage(String author,String title,String content,String email) {
		m.addMessage(author, title, content, email);
	}
	
	public void updateMessage(String mid,String author,String title,String content,String email) {
		m.updateMessage(mid,author, title, content, email);
	}
	
	public List<Message> findMessage(String author,String email,String content) {
		return m.findMessage(author, content, email);
	}
}
