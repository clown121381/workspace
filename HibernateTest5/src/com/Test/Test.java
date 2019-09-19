package com.Test;

import java.util.List;

import com.Idao.ICityLocation;
import com.cityLoaction.Impl.CityLocation;
import com.my_city.City;
import com.my_location.Location;

public class Test {
	static ICityLocation cl = new CityLocation();
	public static void main(String[] args) {
		
		
		Location loc = new Location();
		loc.setLoc_name("ÁÉÄþ");

		
		City c1 = new City();
		c1.setC_name("Ê¯¼Ò×¯");
		
//		cl.addLocation(loc);
//		cl.addCity(c1);
		
//		cl.deleteLocation(4);
		//cl.deleteCity(c1);
		
		//City c = cl.selectACity(15);
//		
//		String hql = "select c.c_name from Location l join City c with c.loc = l where loc_name = 'ÁÉÄþ'";
//		List<String> li= cl.hqlSelect(hql);
//		System.out.println(li);
		
		
		cl.update(21,9, c1,loc);
	}
}
