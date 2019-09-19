package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.message.Message;
import com.user.User;

public interface MessageMapper {
	public void addMessage(@Param("author") String author,@Param("title") String title,@Param("content") String content,@Param("email") String email);
	public List<Message> findMessage(@Param("author") String author,@Param("content") String content,@Param("email") String email);
	public void deleteMessage(int mid);
	public void updateMessage(@Param("mid") String mid,@Param("author") String author,@Param("title") String title,@Param("content") String content,@Param("email") String email);
	public List<Message> findAllMessage();
	public User findAUser(@Param("id") String id,@Param("password") String password);
}
