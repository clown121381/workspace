package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bean.Table_Vendor;
import com.spring.dao.BillDao;
@Service("service")
public class ServiceImpl implements IService{

	@Autowired
	private BillDao billDao;
	
	@Override
	public Table_Vendor findAVendorByVendorName(String vendor_name) {
		return billDao.findAVendorByVendorName(vendor_name);
	}

	@Override
	public List<Table_Vendor> findAllVendor() {
		return billDao.findAllVendor();
	}
	
}
