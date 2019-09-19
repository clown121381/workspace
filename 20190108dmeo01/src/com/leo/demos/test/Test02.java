package com.leo.demos.test;

import com.leo.demos.service.DeptEmpService;

public class Test02 {

	public static void main(String[] args) throws Exception{
		
		DeptEmpService ds = new DeptEmpService();
		
		String deptno = "98";
		String dname  = "c";
		String loc    = "Tokyo";
		
		
		String empno = "9999";
		String ename ="leo";
		
		ds.saveDeptAndEmp(deptno, dname, loc, empno, ename);
		System.out.println("ok");
	}

}
