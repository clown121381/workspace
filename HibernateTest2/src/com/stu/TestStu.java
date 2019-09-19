package com.stu;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernateUtil.HibernateUtil;

public class TestStu {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();	
		Student stu = new  Student();
		stu.setStu_id("3");
		stu.setStu_name("zhangsan");
		stu.setStu_age("13");
		//É¾³ý
		//session.delete(stu);
//²éÑ¯
//		Student student1 = session.get(Student.class, new String("1"));		
//		System.out.println(student1.getStu_id());
//		System.out.println(student1.getStu_name());
//		System.out.println(student1.getStu_age());
		//Ôö¼Ó
		session.save(stu);
		tx.commit();
		HibernateUtil.close();
	}
}
