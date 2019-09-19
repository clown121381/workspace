package com.yang.cloud.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yang.api.entity.Dept;

@RestController
public class DefaultController {
	
	//private final String REST_URL_PREFIX="http://localhost:8080";
	private final String REST_URL_PREFIX="http://cloud-provider";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/get/{deptno}")
	public Dept get(@PathVariable("deptno") Long deptno){
		return restTemplate.getForObject(REST_URL_PREFIX+"/get/"+deptno, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@GetMapping("/list")
	public List<Dept> list(){
		return restTemplate.getForObject(REST_URL_PREFIX+"/list", List.class);		
	}
	
	@PostMapping("/add")
	public boolean add(Dept dept){
		return restTemplate.postForObject(REST_URL_PREFIX+"/add", dept, Boolean.class);
	}
}
