package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import JDBCUtil.JDBCUtil;

public class LocationDao {
	public PreparedStatement pst = null;
	public ResultSet rs = null;
	public int insertIntoLocation(int coun_id,String loc_name) throws SQLException{
		Connection conn = JDBCUtil.getConn();

		conn.setAutoCommit(false);

		// sql���
		String sql = "insert into location values(loc_s.nextval,?,?)";
		pst = conn.prepareStatement(sql);
		pst.setInt(1, coun_id);
		pst.setString(2, loc_name);
		// ִ��sql
		pst.executeQuery();
		int flag = pst.getUpdateCount();
		// �ر���Դ
		return flag;
	}
}
