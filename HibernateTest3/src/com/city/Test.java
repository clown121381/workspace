package com.city;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernateUtil.HibernateUtil;
import com.page.Page;

public class Test {
	public static List<CityTest> getPage(int currentPage,int perPageRows) {
		Session session = HibernateUtil.getSession();
		Transaction ts = session.beginTransaction();
		Page page = new Page();
		page.setCurrentPage(currentPage);
		page.setPerPageRows(perPageRows);
		Criteria criteria = session.createCriteria(CityTest.class);
		currentPage = page.getCurrentPage();
		perPageRows = page.getPerPageRows();
		criteria.setFirstResult((currentPage - 1) * perPageRows);
		criteria.setMaxResults(perPageRows);
		List<CityTest> it = criteria.list();
		ts.commit();
		HibernateUtil.closeSession();
		HibernateUtil.closesessionFactory();
		return it;
	}
	public static void main(String[] args) {
		
		List<CityTest> it = getPage(2,3);
			System.err.println(it);
	}
}
