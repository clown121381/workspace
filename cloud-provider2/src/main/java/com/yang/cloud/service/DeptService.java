package com.yang.cloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yang.api.entity.Dept;
import com.yang.cloud.dao.DeptMapper;

@Service
public class DeptService {
	@Autowired
	private DeptMapper deptMapper;

	public Dept get(Long deptno){
		return deptMapper.getDeptByDeptno(deptno);
	}
	
	public List<Dept> getAll(){
		return deptMapper.getAll();
	}
	
	public boolean add(Dept dept){
		return deptMapper.add(dept);
	}
	

}
