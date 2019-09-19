package com.spring.bean;

public class Woman implements Person{

	private String name;
	private String age;
	@Override
	public String toString() {
		return "Woman [name=" + name + ", age=" + age + "]";
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
		System.out.println("woman" + "ĞÕÃû£º" + name + "ÄêÁä£º" + age); 
	}


}
