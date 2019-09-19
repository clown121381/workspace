package com.spring.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.bean.Admin;
import com.spring.bean.Message;
import com.spring.dao.NoteBookDao;

@Service("noteBookService")
public class NoteBookServiceImpl implements NoteBookService{

	@Autowired
	NoteBookDao noteBookDao;
		
	@Override
	public Admin findUser(String username) {
		
		return this.noteBookDao.findUser(username);
	}

	@Override
	public List<Message> findAllMess() {
		
		return this.noteBookDao.findAllMess();
	}

	@Override
	@Transactional
	public boolean addMessage(Message message) {
		String date = new SimpleDateFormat("YYYY-MM-dd").format(new Date());
		message.setAdd_date(date);
		int flag = this.noteBookDao.addMessage(message);
		if(flag > 0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Message findMess(Integer mid) {
		return this.noteBookDao.findMess(mid);
	}

	@Override
	@Transactional
	public boolean updateMess(Message message) {
		int flag = this.noteBookDao.updateMess(message);
		if(flag > 0)
			return true;
		else
			return false;
	}

	@Override
	@Transactional
	public boolean deleteMess(Integer mid) {
		int flag = this.noteBookDao.deleteMess(mid);
		if(flag > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Message> findMessByMore(Message message) {
		return this.noteBookDao.findMessByMore(message.getAuthor(), message.getEmail(), message.getContent());
	}

	

}
