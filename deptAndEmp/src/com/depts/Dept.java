package com.depts;

import java.io.Serializable;
import java.util.List;

import com.emps.Emp;

public class Dept implements Serializable{
	private static final long serialVersionUID = 1L;
	private int deptid;
	private String deptname;
	private String leader;
	private List<Emp> emps;
	public int getDeptid() {
		return deptid;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", deptname=" + deptname
				+ ", leader=" + leader + "]";
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
}
