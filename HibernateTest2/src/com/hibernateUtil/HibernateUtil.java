package com.hibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Configuration config = null;
	private static SessionFactory sf = null;
	private static Session session = null;
	static {
		config = new Configuration().configure();
		sf = config.buildSessionFactory();
		session = sf.openSession();
	}	
	public static Session getSession() {
		return session;
	}	
	public static void close() {
		session.close();
		sf.close();
	}
}
