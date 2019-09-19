package com.service;

import java.util.List;

import com.spring.bean.Student;

public interface IService {
public boolean insertStudent(Student student);
	
	public boolean updateStudent(Student student);
	
	public boolean deleteStudent(Integer s_id);
	
	public Student findById(Integer s_id);
	
	public List<Student> findAll();
}
