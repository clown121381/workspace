package com.Iemp;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.depts.Dept;
import com.emps.Emp;

public interface Iemp {

	@Insert("insert into emps(empid,empname,salary,age,deptid) values(#{empid},#{empname},#{salary},#{age},#{deptid})")
	public void insertEmp(Emp emp);
	
	@Select("select * from emps where deptid=#{id}")
	@Results({
		@Result(id=true,column="empid",property="empid"),
		@Result(column="empname",property="empname"),
		@Result(column="salary",property="salary"),
		@Result(column="age",property="age"),
	})
	public List<Emp> selectByDeptId(int id);
	
	@Select("select * from depts where deptid =(select deptid from emps where salary=(select max(salary) from emps))")
	@Results({
		@Result(id=true,column="deptid",property="deptid"),
		@Result(column="deptname",property="deptname"),
		@Result(column="leader",property="leader"),
		@Result(column="deptid",property="emps",
			many=@Many(select="com.Iemp.Iemp.selectByDeptId"))
	})
	public Dept selectMaxSalary();
	
	@Select("select * from emps where salary between #{salary1} and #{salary2}")
	@Results({
		@Result(id=true,column="empid",property="empid"),
		@Result(column="empname",property="empname"),
		@Result(column="salary",property="salary"),
		@Result(column="age",property="age"),
		@Result(column="deptid",property="dept",
				one=@One(select="com.Iemp.Iemp.selectDept"))
	})
	public List<Emp> selectBySalary(@Param("salary1") int salary1,@Param("salary2") int salary2);
	
	@Select("select * from depts where deptid=#{deptid}")
	public Dept selectDept(int deptid);
	
	@SelectProvider(type=com.Iemp.ParamSql.class,method="selectWithParamSql")
	public List<Emp> selectEmp(Map<String,Object> param);
}
