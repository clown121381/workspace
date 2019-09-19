package com.spring.handler;

import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.Student;

public interface IHandler {
	public String addStudent(Student student);
	public String updateStudent(Student student);
	public String deleteStudent(Integer s_id);
	public String findByid(Student student,Integer s_id);
	public ModelAndView findAll();
}
