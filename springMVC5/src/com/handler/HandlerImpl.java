package com.handler;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.bean.Student;
@Controller
public class HandlerImpl{

	@RequestMapping(value={"/addStudent"})
	public String addStudent() {
		return "addStu";
	}

	public String updateStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	public String findById() {
		// TODO Auto-generated method stub
		return null;
	}

	public String findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}