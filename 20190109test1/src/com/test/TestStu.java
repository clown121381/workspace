package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.element.Student;


public class TestStu {
	private static SessionFactory sessionFactory = null;
	private static Session session = null;
	private static Transaction transaction = null;
	
	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		sessionFactory = config.buildSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();

		
		
		Student stu = new Student();
		stu.setSid(2017);
		stu.setSname("ะกอ๕");
		stu.setSage(18);
	    session.save(stu);
	    
	    
	    transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
