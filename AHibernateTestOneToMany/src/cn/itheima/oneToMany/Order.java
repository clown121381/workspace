package cn.itheima.oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="m_Order")
@GenericGenerator(name="pk",strategy="increment")
public class Order {
	@Id
	@GeneratedValue(generator="pk")
	@Column(name="id")
	private int id;
	@Column(name="money")
	private double money;
	@Column(name="receiverInfo")
	private String receiverInfo;
	@ManyToOne
	@JoinColumn(name="c_customer_id")
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
