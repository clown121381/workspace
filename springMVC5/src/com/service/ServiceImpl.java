package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bean.Student;
import com.spring.dao.StudentDao;

@Service("iService")
public class ServiceImpl implements IService{
	@Autowired
	private StudentDao studentDaoImpl;
	
	@Override
	public boolean insertStudent(Student student) {
		this.studentDaoImpl.insertStudent(student);
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(Integer s_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findById(Integer s_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
