package cn.itheima.oneToMany;

public class Order {
	private int id;
	private double money;
	private String receiverInfo;
	private Customer c;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getReceiverInfo() {
		return receiverInfo;
	}
	public void setReceiverInfo(String receiverInfo) {
		this.receiverInfo = receiverInfo;
	}
	public Customer getC() {
		return c;
	}
	public void setC(Customer c) {
		this.c = c;
	}
	
}
