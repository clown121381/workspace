package com.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.IService;
import com.spring.bean.Student;
@Controller
public class HandlerImpl2 implements IHandler{
	@Autowired
	private IService iService;
	
	@Override
	@RequestMapping(value={"/add"})
	public String addStudent(Student student) {
		System.out.println(student);
		iService.insertStudent(student);
		return "success";
	}

	@Override
	public String updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(Integer s_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findById(Integer s_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
