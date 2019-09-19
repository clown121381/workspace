package com.spring.dao;

import java.util.List;

import com.spring.bean.Table_Vendor;

public interface BillDao {
	public Table_Vendor findAVendorByVendorName(String vendor_name);
	public List<Table_Vendor> findAllVendor();
}
