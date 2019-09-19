package com.Idao;

import java.util.List;

import com.my_city.City;
import com.my_location.Location;

public interface ICityLocation {
	public int addCity(City city);
	public int addLocation(Location loc);
	public int deleteCity(int c_id);
	public int deleteLocation(int c_id);
	public int update(int c_id,int loc_id,City city1,Location loc1);
	public List<Location> selectAllLoc();
	public List<City> selectAllCity();
	public City selectACity(int c_id);
	public Location selectALoc(int loc_id);
	
	
	public<T> List<T> hqlSelect(String hql);
}
