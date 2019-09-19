package com.test;

import java.sql.SQLException;

import JDBCUtil.JDBCUtil;

import com.dao.CityDao;
import com.dao.LocationDao;

public class test {
	static CityDao city = new CityDao();
	static LocationDao location = new LocationDao();
	
	public static void main(String[] args) {
		try {
	
			int flag1 = city.insertIntoCity(1,"�Ϻ�",200);
			int flag2 = location.insertIntoLocation( 1, "˫Ѽɽ");
			
			if(flag1 != 0 && flag2 != 0)
			{
				JDBCUtil.commitResult();
				JDBCUtil.close(city.pst,city.rs);
				JDBCUtil.close(location.pst,location.rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
