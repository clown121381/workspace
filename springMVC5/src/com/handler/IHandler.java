package com.handler;

import com.spring.bean.Student;

public interface IHandler {
	public String addStudent(Student student);
	public String updateStudent(Student student);
	public String deleteStudent(Integer s_id);
	public String findById(Integer s_id);
	public String findAll();
}
