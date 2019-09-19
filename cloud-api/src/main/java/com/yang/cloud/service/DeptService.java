package com.yang.cloud.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.yang.api.entity.Dept;

@FeignClient(value="cloud-provider")
public interface DeptService{
	
	@GetMapping("/get/{deptno}")
	public Dept get(@PathVariable(value="deptno") Long deptno);
	
	@GetMapping("/list")
	public List<Dept> getAll();
	
	@PostMapping("/add")
	public boolean add(Dept dept);
}
