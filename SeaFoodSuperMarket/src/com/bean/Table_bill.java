package com.bean;

import java.io.Serializable;

public class Table_bill implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer Vendor_id;
	private String Bill_amount;
	private String Bill_due_date;
	private String Bill_date;
	private String Bill_paid_flag;
	private Integer Bill_id;
	public String getBill_amount() {
		return Bill_amount;
	}
	public void setBill_amount(String bill_amount) {
		Bill_amount = bill_amount;
	}
	public String getBill_due_date() {
		return Bill_due_date;
	}
	public void setBill_due_date(String bill_due_date) {
		Bill_due_date = bill_due_date;
	}
	public String getBill_date() {
		return Bill_date;
	}
	public void setBill_date(String bill_date) {
		Bill_date = bill_date;
	}
	public String getBill_paid_flag() {
		return Bill_paid_flag;
	}
	public void setBill_paid_flag(String bill_paid_flag) {
		Bill_paid_flag = bill_paid_flag;
	}
	public Integer getVendor_id() {
		return Vendor_id;
	}
	public void setVendor_id(Integer vendor_id) {
		Vendor_id = vendor_id;
	}
	public Integer getBill_id() {
		return Bill_id;
	}
	public void setBill_id(Integer bill_id) {
		Bill_id = bill_id;
	}
	@Override
	public String toString() {
		return "Table_bill [Vendor_id=" + Vendor_id + ", Bill_amount=" + Bill_amount + ", Bill_due_date="
				+ Bill_due_date + ", Bill_date=" + Bill_date + ", Bill_paid_flag=" + Bill_paid_flag + ", Bill_id="
				+ Bill_id + "]";
	}
	
}
