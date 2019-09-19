package com.hibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Configuration configuration = null;
	private static SessionFactory sessionFactory = null;
	private static Session session = null;
	static {
		try {
			configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();			
		} catch (HibernateException e) {
			System.out.println("解析xml和创建Session工厂error");
			e.printStackTrace();
		}
	}
	
	public static Session getSession() {
		session = sessionFactory.openSession();
		return session;
	}
	
	public static void closeSession() {
		if(session != null)
		{
			session.close();
		}
	}
	
	public static void closesessionFactory() {
		if(sessionFactory != null)
		{
			sessionFactory.close();
		}
	}
}
