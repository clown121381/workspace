package com.star;

import java.io.Serializable;

public class Star implements Serializable{
	private static final long serialVersionUID = 1L;
	private int starid;
	private String Sname;
	private int age;
	private int salary;
	
	@Override
	public String toString() {
		return "Star [starid=" + starid + ", Sname=" + Sname + ", age=" + age
				+ ", salary=" + salary + "]";
	}
	public int getStarid() {
		return starid;
	}
	public void setStarid(int starid) {
		this.starid = starid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
