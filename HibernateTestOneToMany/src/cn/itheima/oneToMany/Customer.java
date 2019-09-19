package cn.itheima.oneToMany;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	private int id;	//Ö÷¼ü
	private String name;
	private Set<Order> orders = new HashSet<Order>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
}
