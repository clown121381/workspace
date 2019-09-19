package com.city.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.city.CityTest;
import com.dao.ICity;
import com.hibernateUtil.HibernateUtil;

public class CityImpl implements ICity{

	@Override
	public List<CityTest> finAll() {
		Session session = HibernateUtil.getSession();
		String hql = "from CityTest";
		List<CityTest> it = session.createQuery(hql,CityTest.class).list();
		HibernateUtil.closeSession();
		HibernateUtil.closesessionFactory();
		return it;
	}

	@Override
	public int save(CityTest city) {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		int num = 0;
		try {
			session.save(city);
			tx.commit();
				num = 1;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			
			HibernateUtil.closesessionFactory();
			HibernateUtil.closeSession();
		}
		return num;
	}

	@Override
	public CityTest findById(Integer c_id) {
		
		Session session = HibernateUtil.getSession();
		Transaction ts = session.beginTransaction();
		CityTest city = session.get(CityTest.class, c_id);
		ts.commit();
		
		HibernateUtil.closeSession();
		HibernateUtil.closesessionFactory();
		return city;
	}

	@Override
	public int update(CityTest city) {
		int num = 0;
		Session session = HibernateUtil.getSession();
		Transaction ts = session.beginTransaction();
		try {
			session.update(city);
			ts.commit();
			num = 1;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession();
			HibernateUtil.closesessionFactory();			
		}
		return num;
	}

	@Override
	public int delete(CityTest city) {
		int num = 0;
		Session session = HibernateUtil.getSession();
		Transaction  ts = session.beginTransaction();
		try {
			session.delete(city);
			ts.commit();
			num = 1;
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally{
			HibernateUtil.closeSession();
			HibernateUtil.closesessionFactory();
		}
		return num;
	}

	
	public CityTest findByName(String c_name) {

		
		Session session = HibernateUtil.getSession();
		String hql = "from CityTest where c_name = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, c_name);
		
		CityTest c = (CityTest)query.uniqueResult(); 
		HibernateUtil.closeSession();
		HibernateUtil.closesessionFactory();
		return c;
	}

	@Override
	public CityTest findByNameAndId(int loc_id, String c_name) {

		Session session = HibernateUtil.getSession();
		String hql = "from CityTest where c_name = ? and loc_id = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, c_name);
		query.setParameter(1, loc_id);
		
		CityTest c = (CityTest)query.uniqueResult(); 
		HibernateUtil.closeSession();
		HibernateUtil.closesessionFactory();
		return c;
	}

}
