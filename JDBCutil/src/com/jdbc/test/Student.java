package com.jdbc.test;

public class Student {
	private Integer id;
	private String name;
	private Integer age;
	public Student(Integer id,String name,Integer age) {
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
