package com.my_location;

import java.util.HashSet;
import java.util.Set;

import com.my_city.City;

public class Location {
	@Override
	public String toString() {
		return "Location [loc_id=" + loc_id + ", loc_name=" + loc_name
				+ "]";
	}
	private int loc_id;
	private String loc_name;
	private Set<City> citys =new HashSet<City>();
	public int getLoc_id() {
		return loc_id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		if (citys == null) {
			if (other.citys != null)
				return false;
		} else if (!citys.equals(other.citys))
			return false;
		if (loc_id != other.loc_id)
			return false;
		if (loc_name == null) {
			if (other.loc_name != null)
				return false;
		} else if (!loc_name.equals(other.loc_name))
			return false;
		return true;
	}
	public void setLoc_id(int loc_id) {
		this.loc_id = loc_id;
	}
	public String getLoc_name() {
		return loc_name;
	}
	public void setLoc_name(String loc_name) {
		this.loc_name = loc_name;
	}
	public Set<City> getCitys() {
		return citys;
	}
	public void setCitys(Set<City> citys) {
		this.citys = citys;
	}

}
