package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.bean.Table_Vendor;

@Repository("billDao")
public class BillDaoImpl implements BillDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Table_Vendor findAVendorByVendorName(String vendor_name) {
		String sql="select * from table_vendor where vendor_name=?";
		return jdbcTemplate.queryForObject(sql,new RowMapper<Table_Vendor>() {

			@Override
			public Table_Vendor mapRow(ResultSet rs, int i) throws SQLException {
				Table_Vendor vendor = new Table_Vendor();
				vendor.setVendor_name(rs.getString("vendor_name"));
				vendor.setVendor_address(rs.getString("vendor_address"));
				vendor.setVendor_phone(rs.getString("vendor_phone"));
				vendor.setVendor_fax(rs.getString("vendor_fax"));
				vendor.setVendor_contact_person(rs.getString("vendor_contact_person"));
				vendor.setVendor_id(rs.getInt("vendor_id"));
				return vendor;
			}
			
		},vendor_name);
	}
	@Override
	public List<Table_Vendor> findAllVendor() {
		String sql="select * from table_vendor";
		return jdbcTemplate.query(sql,new RowMapper<Table_Vendor>() {

			@Override
			public Table_Vendor mapRow(ResultSet rs, int i) throws SQLException {
				Table_Vendor vendor = new Table_Vendor();
				vendor.setVendor_name(rs.getString("vendor_name"));
				vendor.setVendor_address(rs.getString("vendor_address"));
				vendor.setVendor_phone(rs.getString("vendor_phone"));
				vendor.setVendor_fax(rs.getString("vendor_fax"));
				vendor.setVendor_contact_person(rs.getString("vendor_contact_person"));
				vendor.setVendor_id(rs.getInt("vendor_id"));
				return vendor;
			}
			
		});
	}

}
