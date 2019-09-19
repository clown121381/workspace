package com.Idept;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.depts.Dept;

public interface Idept {
	@Insert("insert into depts(deptid,deptname,leader) values(#{deptid},#{deptname},#{leader})")
	public void insertDept(Dept dept);
	@Select("select * from depts d join emps e on d.deptid=e.deptid where d.deptid=#{deptid}")
	@Results({
		@Result(id=true,column="deptid",property="deptid"),
		@Result(column="deptname",property="deptname"),
		@Result(column="leader",property="leader"),
		@Result(column="deptid",property="emps",
			many=@Many(select="com.Iemp.Iemp.selectByDeptId"))
	})
	public Dept selectById(int deptid);
}
