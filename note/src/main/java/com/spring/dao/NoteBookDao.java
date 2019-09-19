package com.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.spring.bean.Admin;
import com.spring.bean.Message;
@Repository
public interface NoteBookDao {
	public Admin findUser(String username);
	
	public List<Message> findAllMess();

	public int addMessage(Message message);

	public Message findMess(Integer mid);

	public int updateMess(Message message);

	public int deleteMess(Integer mid);
	
	public List<Message> findMessByMore(@Param("author") String author,@Param("email") String email,@Param("content") String content);
}
