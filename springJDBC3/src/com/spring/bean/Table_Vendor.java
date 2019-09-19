package com.spring.bean;

import java.io.Serializable;

public class Table_Vendor implements Serializable{
	private static final long serialVersionUID = 1L;
	private String vendor_name;
	private String vendor_address;
	private String vendor_phone;
	private String vendor_fax;
	private String vendor_contact_person;
	private Integer vendor_id;
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getVendor_address() {
		return vendor_address;
	}
	public void setVendor_address(String vendor_address) {
		this.vendor_address = vendor_address;
	}
	public String getVendor_phone() {
		return vendor_phone;
	}
	public void setVendor_phone(String vendor_phone) {
		this.vendor_phone = vendor_phone;
	}
	public String getVendor_fax() {
		return vendor_fax;
	}
	public void setVendor_fax(String vendor_fax) {
		this.vendor_fax = vendor_fax;
	}
	public String getVendor_contact_person() {
		return vendor_contact_person;
	}
	public void setVendor_contact_person(String vendor_contact_person) {
		this.vendor_contact_person = vendor_contact_person;
	}
	public Integer getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(Integer vendor_id) {
		this.vendor_id = vendor_id;
	}
	@Override
	public String toString() {
		return "Table_Vendor [vendor_name=" + vendor_name + ", vendor_address=" + vendor_address + ", vendor_phone="
				+ vendor_phone + ", vendor_fax=" + vendor_fax + ", vendor_contact_person=" + vendor_contact_person
				+ ", vendor_id=" + vendor_id + "]";
	}
}