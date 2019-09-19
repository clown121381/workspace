package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBCUtil.JDBCUtil;

public class CityDao {
	public PreparedStatement pst = null;
	public ResultSet rs = null;
	public int insertIntoCity(int loc_id, String c_name, int peo_count)
			throws SQLException {

		Connection conn = JDBCUtil.getConn();

		conn.setAutoCommit(false);

		// sql”Ôæ‰
		String sql = "insert into city values(city_s.nextval,?,?,?)";
		pst = conn.prepareStatement(sql);
		pst.setInt(1, loc_id);
		pst.setString(2, c_name);
		pst.setInt(3, peo_count);
		// ÷¥––sql
		int i = 0/0;
		pst.executeQuery();
		int flag = pst.getUpdateCount();
		return flag;
	}
	
}