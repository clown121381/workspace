package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bean.Table_Dept;
import com.bean.Table_Income;
import com.bean.Table_Vendor;
import com.bean.Table_bill;

public interface mapper {
	public List<Table_Vendor> selectAllVendor();
	
	public List<Table_Dept> selectAllDept();
	
	public void insertIntoBill(@Param("vendor_id") Integer vendor_id,@Param("d1") String d1,@Param("d2") String d2,@Param("sum") String sum);
	
	public void insertIntoBillItem(@Param("bill_id") Integer bill_id,@Param("dept_id") Integer dept_id,@Param("sum") String sum);
	
	public String selectBillId(@Param("vendor") Integer vendor,@Param("sum") String sum,@Param("d1") String d1,@Param("d2") String d2);
	
	public Table_Vendor selectVendorByName(String vendor_name);
	
	public Table_Vendor selectVendorById(Integer vendor_id);
	
	public List<Table_bill> selectBillByVendorId(Integer vendor_id);
	
	public void UpdatePaidFlag(Integer bill_id);
	
	public void updateVendor(@Param("id") Integer id,@Param("name") String name,@Param("address") String address,@Param("fax") String fax,@Param("phone") String phone,@Param("person") String person);
	
	public void insertVendor(@Param("name") String name,@Param("address") String address,@Param("fax") String fax,@Param("phone") String phone,@Param("person") String person);

	public Table_Dept selectADept(Integer id);
	
	public void updateDept(@Param("id") Integer id,@Param("name") String name,@Param("desc") String desc);

	public void insertDept(@Param("name") String name,@Param("desc") String desc);

	public List<Table_Income> selectSysIncome();
	
	public Table_Income selectIncomeById(Integer id);
	
	public void updateDailyIncome(@Param("id") Integer id,@Param("income") String income);

	public void insertIncome(@Param("deptid")Integer deptid,@Param("dailyincome") String dailyincome);
}
