package com.spring.bean;

import java.io.Serializable;

public class Table_bill_item implements Serializable{
	@Override
	public String toString() {
		return "Table_bill_item [bill_item_id=" + bill_item_id + ", bill_item_Expense=" + bill_item_Expense
				+ ", bept_id=" + bept_id + ", bill_id=" + bill_id + "]";
	}
	private static final long serialVersionUID = 1L;
	private Integer bill_item_id;
	private String bill_item_Expense;
	private Integer bept_id;
	private Integer bill_id;
	public Integer getBill_item_id() {
		return bill_item_id;
	}
	public void setBill_item_id(Integer bill_item_id) {
		this.bill_item_id = bill_item_id;
	}
	public String getBill_item_Expense() {
		return bill_item_Expense;
	}
	public void setBill_item_Expense(String bill_item_Expense) {
		this.bill_item_Expense = bill_item_Expense;
	}
	public Integer getBept_id() {
		return bept_id;
	}
	public void setBept_id(Integer bept_id) {
		this.bept_id = bept_id;
	}
	public Integer getBill_id() {
		return bill_id;
	}
	public void setBill_id(Integer bill_id) {
		this.bill_id = bill_id;
	}
}
