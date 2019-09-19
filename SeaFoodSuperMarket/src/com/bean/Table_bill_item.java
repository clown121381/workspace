package com.bean;

import java.io.Serializable;

public class Table_bill_item implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer Bill_item_id;
	private String Bill_item_Expense;
	private Integer Dept_id;
	private Integer Bill_id;
	public Integer getBill_item_id() {
		return Bill_item_id;
	}
	public void setBill_item_id(Integer bill_item_id) {
		Bill_item_id = bill_item_id;
	}
	public String getBill_item_Expense() {
		return Bill_item_Expense;
	}
	public void setBill_item_Expense(String bill_item_Expense) {
		Bill_item_Expense = bill_item_Expense;
	}
	public Integer getDept_id() {
		return Dept_id;
	}
	public void setDept_id(Integer dept_id) {
		Dept_id = dept_id;
	}
	public Integer getBill_id() {
		return Bill_id;
	}
	public void setBill_id(Integer bill_id) {
		Bill_id = bill_id;
	}
	@Override
	public String toString() {
		return "Bill_item [Bill_item_id=" + Bill_item_id + ", Bill_item_Expense=" + Bill_item_Expense + ", Dept_id="
				+ Dept_id + ", Bill_id=" + Bill_id + "]";
	}
	
}
