package com.spring.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller("User")
public class User {
	@PutMapping
	public void update(){
		System.out.println("update");
	}
	@GetMapping
	public void get(){
		System.out.println("get");
	}
	@DeleteMapping
	public void delete(){
		System.out.println("delete");
	}
	@PostMapping
	public void add(){
		System.out.println("post");
	}
}
