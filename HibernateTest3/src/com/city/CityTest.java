package com.city;

import java.io.Serializable;

public class CityTest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int c_id;
	private int loc_id;
	private String c_name;
	private int peo_count;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getLoc_id() {
		return loc_id;
	}
	public void setLoc_id(int loc_id) {
		this.loc_id = loc_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getPeo_count() {
		return peo_count;
	}
	public void setPeo_count(int peo_count) {
		this.peo_count = peo_count;
	}
	
	@Override
	public String toString() {
	
		return "City:{"+this.getC_id()+"+"+this.getLoc_id()+"+"+this.getC_name()+"+"+this.getPeo_count()+"}";
	}
}
