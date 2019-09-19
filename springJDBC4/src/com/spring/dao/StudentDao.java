package com.spring.dao;

import java.util.List;

import com.spring.bean.Student;

public interface StudentDao {
	public boolean insertStudent(Student student);
	
	public boolean updateStudent(Student student);
	
	public boolean deleteStudent(Integer s_id);
	
	public Student findById(Integer s_id);
	
	public List<Student> findAll();
}
