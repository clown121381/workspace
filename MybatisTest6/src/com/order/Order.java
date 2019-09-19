package com.order;

import com.person.Person;

public class Order {
	private int orderid;
	private int total;
	private int pid;
	private Person person;
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", total=" + total + ", pid="
				+ pid + ", person=" + person + "]";
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
