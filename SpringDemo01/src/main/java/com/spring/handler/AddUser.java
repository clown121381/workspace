package com.spring.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.service.UserService;

@Controller
public class AddUser {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/AddUser.action")
	@ResponseBody
	public void addUser(){
		userService.addUser();
	}
	@RequestMapping("/index.jsp")
	@ResponseBody
	public String toIndex() {
		return "/index.jsp";
	}
}
