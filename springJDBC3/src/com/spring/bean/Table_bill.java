package com.spring.bean;

import java.io.Serializable;

public class Table_bill implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer vendor_id;
	private String bill_amount;
	private String bill_due_date;
	private String bill_date;
	private String bill_paid_flag;
	@Override
	public String toString() {
		return "Table_bill [vendor_id=" + vendor_id + ", bill_amount=" + bill_amount + ", bill_due_date="
				+ bill_due_date + ", bill_date=" + bill_date + ", bill_paid_flag=" + bill_paid_flag + "]";
	}
	Integer getVendor_id() {
		return vendor_id;
	}
	void setVendor_id(Integer vendor_id) {
		this.vendor_id = vendor_id;
	}
	String getBill_amount() {
		return bill_amount;
	}
	void setBill_amount(String bill_amount) {
		this.bill_amount = bill_amount;
	}
	String getBill_due_date() {
		return bill_due_date;
	}
	void setBill_due_date(String bill_due_date) {
		this.bill_due_date = bill_due_date;
	}
	String getBill_date() {
		return bill_date;
	}
	void setBill_date(String bill_date) {
		this.bill_date = bill_date;
	}
	String getBill_paid_flag() {
		return bill_paid_flag;
	}
	void setBill_paid_flag(String bill_paid_flag) {
		this.bill_paid_flag = bill_paid_flag;
	}
	
}
