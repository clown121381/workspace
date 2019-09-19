package com.bean;

import java.io.Serializable;

public class Table_Dept implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer Dept_id;
	private String Dept_name;
	private String Dept_description;
	public Integer getDept_id() {
		return Dept_id;
	}
	public void setDept_id(Integer dept_id) {
		Dept_id = dept_id;
	}
	public String getDept_name() {
		return Dept_name;
	}
	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}
	public String getDept_description() {
		return Dept_description;
	}
	public void setDept_description(String dept_description) {
		Dept_description = dept_description;
	}
	@Override
	public String toString() {
		return "Dept [Dept_id=" + Dept_id + ", Dept_name=" + Dept_name + ", Dept_description=" + Dept_description + "]";
	}
	
}
