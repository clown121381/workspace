package com.yang.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yang.api.entity.Dept;
import com.yang.cloud.service.DeptService;

@RestController
public class DefaultController {
	@Autowired
	private DeptService deptService;
	
	
	@GetMapping("/get/{deptno}")
	@HystrixCommand(fallbackMethod="getNullMethod_GET")
	public Dept get(@PathVariable Long deptno){
		Dept d = deptService.get(deptno);
		if(d==null){
			throw new RuntimeException("没有数据");
		}
		return deptService.get(deptno);
	}
	public Dept getNullMethod_GET(@PathVariable Long deptno){
			return new Dept((long) Integer.MAX_VALUE,"null","数据库中没有数据");
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
