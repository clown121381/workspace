package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bean.Student;
import com.spring.dao.StudentDao;

@Service("iService")
public class ServiceImpl implements IService{
	@Autowired
	private StudentDao studentDao;

	@Override
	public boolean insertStudent(Student student) {

		return this.studentDao.insertStudent(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(Integer s_id) {
		return this.studentDao.deleteStudent(s_id);
	}

	@Override
	public Student findById(Integer s_id) {
		return this.studentDao.findById(s_id);
	}

	@Override
	public List<Student> findAll() {
		return this.studentDao.findAll();
	}
	
}
