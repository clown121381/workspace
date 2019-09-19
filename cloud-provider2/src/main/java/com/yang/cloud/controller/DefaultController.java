package com.yang.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yang.api.entity.Dept;
import com.yang.cloud.service.DeptService;

@RestController
public class DefaultController {
	@Autowired
	private DeptService deptService;
	
	
	@GetMapping("/get/{deptno}")
	public Dept get(@PathVariable Long deptno){
		return deptService.get(deptno);
	}
	
	@GetMapping("/list")
	public List<Dept> list(){
		return deptService.getAll();		
	}
	
	@PostMapping("/add")
	public boolean add(Dept dept){
		return deptService.add(dept);
	}
}
