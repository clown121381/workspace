package com.my_city;

import com.my_location.Location;

public class City {
	private int c_id;
	private String c_name;
	private Location loc;
	
	public int getC_id() {
		return c_id;
	}
	@Override
	public String toString() {
		return "City [c_id=" + c_id + ", c_name=" + c_name + ", loc=" + loc
				+ "]";
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (c_id != other.c_id)
			return false;
		if (c_name == null) {
			if (other.c_name != null)
				return false;
		} else if (!c_name.equals(other.c_name))
			return false;
		if (loc == null) {
			if (other.loc != null)
				return false;
		} else if (!loc.equals(other.loc))
			return false;
		return true;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public Location getLoc() {
		return loc;
	}
	public void setLoc(Location loc) {
		this.loc = loc;
	}
}
