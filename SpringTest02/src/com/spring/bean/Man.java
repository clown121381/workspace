package com.spring.bean;

public class Man implements Person{
	
	private String name;
	private String age;
	
	public Man() {	}
	
	public Man(String name,String age) {	
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Man [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public void SayHello() {
		// TODO Auto-generated method stub
		System.out.println("man" + "ĞÕÃû£º" + name + "ÄêÁä£º" + age);
	}

}
