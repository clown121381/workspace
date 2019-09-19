package com.spring.bean;

public class Student {
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_sex=" + s_sex + ", s_age=" + s_age + "]";
	}
	private Integer s_id;
	private String s_name;
	private String s_sex;
	private Integer s_age;
	
	public Student() {
		
	}
	
	public Student(Integer s_id,String s_name,String s_sex,Integer s_age) {
		this.s_id=s_id;
		this.s_age=s_age;
		this.s_name=s_name;
		this.s_sex=s_sex;
	}
	public Integer getS_id() {
		return s_id;
	}
	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_sex() {
		return s_sex;
	}
	public void setS_sex(String s_sex) {
		this.s_sex = s_sex;
	}
	public Integer getS_age() {
		return s_age;
	}
	public void setS_age(Integer s_age) {
		this.s_age = s_age;
	}
}
