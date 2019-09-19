package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bean.Table_Dept;
import com.bean.Table_Income;
import com.bean.Table_Vendor;
import com.bean.Table_bill;
import com.mapper.mapper;

import MybatisUtil.Mybatis_Util;

public class MapperDao {
	SqlSession session = Mybatis_Util.getSqlSession(true);
	mapper m = session.getMapper(mapper.class);
	public void commit() {
		session.commit();
	}
	public List<Table_Vendor> selectAllVendor() {
		return m.selectAllVendor();
	}
	
	public List<Table_Dept> selectAllDept() {
		return m.selectAllDept();
	}
	
	public void insertIntoBill(Integer vendor_id,String d1,String d2,String sum) {
		m.insertIntoBill(vendor_id, d1, d2, sum);
	}
	
	public void insertIntoBillItem(Integer bill_id,Integer dept_id,String sum) {
		m.insertIntoBillItem(bill_id, dept_id, sum);
	}
	
	public String selectBillId(Integer vendor,String sum,String d1,String d2) {
		return m.selectBillId(vendor, sum, d1, d2);
	}
	
	public Table_Vendor selectVendorByName(String vendor_name) {
		return m.selectVendorByName(vendor_name);
	}
	
	public List<Table_bill> selectBillByVendorId(Integer vendor_id) {
		return m.selectBillByVendorId(vendor_id);
	}
	
	public void UpdatePaidFlag(Integer bill_id) {
		m.UpdatePaidFlag(bill_id);
	}
	
	public Table_Vendor selectVendorById(Integer vendor_id) {
		return m.selectVendorById(vendor_id);
	}
	
	public void updateVendor(Integer id,String name,String address,String fax,String phone,String person) {
		m.updateVendor(id, name, address, fax, phone, person);
	}
	
	public void insertVendor(String name,String address,String fax,String phone,String person) {
		m.insertVendor(name, address, fax, phone, person);
	}
	
	public Table_Dept selectADept(Integer id) {
		return m.selectADept(id);
	}
	
	public void updateDept(Integer id,String name,String desc) {
		m.updateDept(id, name, desc);
	}
	
	public void insertDept(String name,String desc) {
		m.insertDept(name, desc);
	}
	
	public List<Table_Income> selectSysIncome() {
		return m.selectSysIncome();
	}
	
	public Table_Income selectIncomeById(Integer id) {
		return m.selectIncomeById(id);
	}
	
	public void updateDailyIncome(Integer id,String income) {
		m.updateDailyIncome(id, income);
	}
	
	public void insertIncome(Integer deptid,String dailyincome) {
		m.insertIncome(deptid, dailyincome);
	}
}
