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
//�����������		
//		Dept d1 = new Dept();
//		d1.setDeptid(1);
//		d1.setDeptname("������");
//		d1.setLeader("����");
//		dept.insertDept(d1);
//		
//		Dept d2 = new Dept();
//		d2.setDeptid(2);
//		d2.setDeptname("�߻���");
//		d2.setLeader("��ΰ");
//		dept.insertDept(d2);
//		
//		Dept d3 = new Dept();
//		d3.setDeptid(3);
//		d3.setDeptname("��Ʋ�");
//		d3.setLeader("��С");
//		dept.insertDept(d3);
//		
//		Emp e1 = new Emp();
//		e1.setEmpid(4);
//		e1.setEmpname("��4");
//		e1.setAge(18);
//		e1.setSalary(600);
//		e1.setDeptid(1);
//		emp.insertEmp(e1);
////		
//		Emp e2 = new Emp();
//		e2.setEmpid(5);
//		e2.setEmpname("��3");
//		e2.setAge(20);
//		e2.setSalary(900);
//		e2.setDeptid(2);
//		emp.insertEmp(e2);
//		
//		Emp e3 = new Emp();
//		e3.setEmpid(6);
//		e3.setEmpname("��8");
//		e3.setAge(19);
//		e3.setSalary(400);
//		e3.setDeptid(3);
//		emp.insertEmp(e3);
//���ݲ���id��ѯ���ż�Ա����Ϣ
//		
//		Dept d = dept.selectById(2);
//		System.out.println(d);
//		System.out.println(d.getEmps());
//		Mybatis_Util.closeSession();
//��ѯ������ߵ�Ա�����ڲ�����Ϣ���ò���ȫ��Ա����Ϣ
//		Dept d = emp.selectMaxSalary();
//		System.out.println(d);
//		System.out.println(d.getEmps());
//��ѯָ����Χ���ʵ�Ա����Ա�����ڲ�����Ϣ
//		List<Emp> li = emp.selectBySalary(300, 500);
//		for(Emp e : li)
//		{
//			System.out.println(e);
//			System.out.println(e.getDept());
//		}
//�ɶ�̬�������������ʷ�Χ�������ѯԱ����Ϣ
		
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("empname", "��");
		
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
