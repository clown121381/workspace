package com.cityLoaction.Impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.Idao.ICityLocation;
import com.hibernateUtil.HibernateUtil;
import com.my_city.City;
import com.my_location.Location;

public class CityLocation implements ICityLocation{

	@Override
	public int addCity(City city) {
		int num = 0;
		try {
			Session session = HibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.save(city);
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

	public int addLocation(Location loc) {
		int num = 0;
		try {
			Session session = HibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			session.save(loc);
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
	public int deleteCity(int c_id) {
		int num = 0;
		try {
			Session session = HibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			City c = session.get(City.class, c_id);
			session.delete(c);
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
	public int deleteLocation(int loc_id) {
		int num = 0;
		try {
			Session session = HibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			Location loc1 = session.get(Location.class, loc_id);
			session.delete(loc1);
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
	public List<Location> selectAllLoc() {
		List<Location> loc = null;
		try {
			Session session = HibernateUtil.getSession();
			String hql = "from Location";
			Query<Location> query = session.createQuery(hql);
			loc = query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession();
			HibernateUtil.closesessionFactory();
		}
		return loc;
	}

	@Override
	public City selectACity(int c_id) {
		City c = null;
		try {
			Session session = HibernateUtil.getSession();
			c = session.get(City.class, c_id);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession();
			HibernateUtil.closesessionFactory();
		}
		return c;
	}

	@Override
	public int update(int c_id,int loc_id,City city1,Location loc1) {
		int num = 0;
		try {
			Session session = HibernateUtil.getSession();
			Transaction ts = session.beginTransaction();
			
			City city = session.get(City.class, c_id);
			Location loc = session.get(Location.class, loc_id);
			
			if(city != null && loc != null)
			{
				loc.getCitys().add(city1);
				city.setLoc(loc1);
			}
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
	public List<City> selectAllCity() {
		List<City> citys = null;
		try {
			Session session = HibernateUtil.getSession();
			String hql = "from City";
			Query<City> query = session.createQuery(hql);
			citys = query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession();
			HibernateUtil.closesessionFactory();
		}
		return citys;
	}

	@Override
	public Location selectALoc(int loc_id) {
		Location loc = null;
		try {
			Session session = HibernateUtil.getSession();
			loc = session.get(Location.class, loc_id);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession();
			HibernateUtil.closesessionFactory();
		}
		return loc;
	}

	@Override
	public<T> List<T> hqlSelect(String hql) {
		List<T> li = null;
		try {
			Session session = HibernateUtil.getSession();
			li = session.createQuery(hql).list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession();
			HibernateUtil.closesessionFactory();
		}
		return li;
	}
}
