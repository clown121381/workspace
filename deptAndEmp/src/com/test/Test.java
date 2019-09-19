package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import MybatisUtil.Mybatis_Util;

import com.Idept.Idept;
import com.Iemp.Iemp;
import com.Iemp.ParamSql;
import com.emps.Emp;

public class Test {
	public static void main(String[] args) {
		SqlSession session = Mybatis_Util.getSqlSession(true);
		Idept dept = session.getMapper(Idept.class);
		Iemp emp = session.getMapper(Iemp.class);
//插入测试数据		
//		Dept d1 = new Dept();
//		d1.setDeptid(1);
//		d1.setDeptname("测评部");
//		d1.setLeader("张文");
//		dept.insertDept(d1);
//		
//		Dept d2 = new Dept();
//		d2.setDeptid(2);
//		d2.setDeptname("策划部");
//		d2.setLeader("张伟");
//		dept.insertDept(d2);
//		
//		Dept d3 = new Dept();
//		d3.setDeptid(3);
//		d3.setDeptname("设计部");
//		d3.setLeader("程小");
//		dept.insertDept(d3);
//		
//		Emp e1 = new Emp();
//		e1.setEmpid(4);
//		e1.setEmpname("杨4");
//		e1.setAge(18);
//		e1.setSalary(600);
//		e1.setDeptid(1);
//		emp.insertEmp(e1);
////		
//		Emp e2 = new Emp();
//		e2.setEmpid(5);
//		e2.setEmpname("张3");
//		e2.setAge(20);
//		e2.setSalary(900);
//		e2.setDeptid(2);
//		emp.insertEmp(e2);
//		
//		Emp e3 = new Emp();
//		e3.setEmpid(6);
//		e3.setEmpname("王8");
//		e3.setAge(19);
//		e3.setSalary(400);
//		e3.setDeptid(3);
//		emp.insertEmp(e3);
//根据部门id查询部门及员工信息
//		
//		Dept d = dept.selectById(2);
//		System.out.println(d);
//		System.out.println(d.getEmps());
//		Mybatis_Util.closeSession();
//查询工资最高的员工所在部门信息及该部门全部员工信息
//		Dept d = emp.selectMaxSalary();
//		System.out.println(d);
//		System.out.println(d.getEmps());
//查询指定范围工资的员工及员工所在部门信息
//		List<Emp> li = emp.selectBySalary(300, 500);
//		for(Emp e : li)
//		{
//			System.out.println(e);
//			System.out.println(e.getDept());
//		}
//可动态根据姓名，工资范围，年龄查询员工信息
		
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("empname", "张");
		
		ParamSql p = new ParamSql();
		String s = p.selectWithParamSql(param);
		System.out.println(s);
//		param.put("salary1",300);
//		param.put("salary2",600);
//		param.put("age", 20);
		List<Emp> li = emp.selectEmp(param);
		System.out.println(li);
	}
}
