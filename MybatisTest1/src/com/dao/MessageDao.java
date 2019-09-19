package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.message.Message;

public interface MessageDao {
	public int addMessage(@Param("author") String author,@Param("title") String title,@Param("content") String content,@Param("email") String email,@Param("add_date") String add_date);
	public Message findMessage(int mid);
	public List<Message> findAllMessage();
	public int deleteMessage(int mid);
	public int updateMessage(@Param("author") String author,@Param("title") String title,@Param("content") String content,@Param("email") String email,@Param("add_date") String add_date);
}
