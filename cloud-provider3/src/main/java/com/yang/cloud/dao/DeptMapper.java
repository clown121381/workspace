package com.yang.cloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yang.api.entity.Dept;

@Mapper
public interface DeptMapper {
	public Dept getDeptByDeptno(Long deptno);
	public List<Dept> getAll();
	public boolean add(Dept dept);
}
