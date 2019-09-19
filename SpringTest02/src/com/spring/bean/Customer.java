package com.spring.bean;

public class Customer {
	private Person person;
	private Man man;
	private String [] order;
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String [] getOrder() {
		return order;
	}

	public void setOrder(String [] order) {
		this.order = order;
	}

	public Man getMan() {
		return man;
	}

	public void setMan(Man man) {
		this.man = man;
	}
	
}
