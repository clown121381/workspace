package com.person;

import java.util.List;

import com.order.Order;

public class Person {
	private int pid;
	private String name;
	private List<Order> orders;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", orders=" + orders
				+ "]";
	}
	
}
