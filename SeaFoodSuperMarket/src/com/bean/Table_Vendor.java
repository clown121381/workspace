package com.bean;

import java.io.Serializable;

public class Table_Vendor implements Serializable{
	@Override
	public String toString() {
		return "Table_Vendor [Vendor_name=" + Vendor_name + ", Vendor_address=" + Vendor_address + ", Vendor_phone="
				+ Vendor_phone + ", Vendor_far=" + Vendor_fax + ", Vendor_contact_person=" + Vendor_contact_person
				+ ", Vendor_id=" + Vendor_id + "]";
	}
	private static final long serialVersionUID = 1L;
	private String Vendor_name;
	private String Vendor_address;
	private String Vendor_phone;
	private String Vendor_fax;
	private String Vendor_contact_person;
	private Integer Vendor_id;
	public String getVendor_name() {
		return Vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		Vendor_name = vendor_name;
	}
	public String getVendor_address() {
		return Vendor_address;
	}
	public void setVendor_address(String vendor_address) {
		Vendor_address = vendor_address;
	}
	public String getVendor_phone() {
		return Vendor_phone;
	}
	public void setVendor_phone(String vendor_phone) {
		Vendor_phone = vendor_phone;
	}
	public String getVendor_fax() {
		return Vendor_fax;
	}
	public void setVendor_fax(String vendor_fax) {
		Vendor_fax = vendor_fax;
	}
	public String getVendor_contact_person() {
		return Vendor_contact_person;
	}
	public void setVendor_contact_person(String vendor_contact_person) {
		Vendor_contact_person = vendor_contact_person;
	}
	public Integer getVendor_id() {
		return Vendor_id;
	}
	public void setVendor_id(Integer vendor_id) {
		Vendor_id = vendor_id;
	}
	
}
