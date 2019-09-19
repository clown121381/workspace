package com.leo.demos.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.leo.demos.dao.DeptDao;
import com.leo.demos.dao.EmpDao;
import com.leo.demos.util.DBUtil;

public class DeptEmpService {
	
	public void saveDeptAndEmp(String deptno,String dname,String loc,String empno,String ename)  {
		
		Connection conn = DBUtil.getConnection();
		
		DeptDao  deptDao = new DeptDao();
		EmpDao   empDao  = new EmpDao();
		

		
		try {
			conn.setAutoCommit(false);
			deptDao.conn = conn;
			empDao.conn  = conn;
			deptDao.saveDept(deptno, dname, loc);
			
			///int i = 1/0;
			
			empDao.saveEmp(empno, ename, deptno);
			
			conn.commit();
			
			
			
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			//conn.close();
		}
		
		
		
	}

}
