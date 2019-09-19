package cn.itheima.oneToMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="m_Customer")
@GenericGenerator(name="pk",strategy="increment")
public class Customer {
	@Id
	@GeneratedValue(generator="pk")
	@Column(name="id")
	private int id;	//Ö÷¼ü
	@Column(name="name")
	private String name;
	@OneToMany
	@Cascade(value={CascadeType.SAVE_UPDATE})
	@JoinColumn(name="c_customer_id")
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
