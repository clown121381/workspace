package com.Idao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.star.Star;

public interface Idao {
	@Insert("insert into stars(starid,sname,age,salary) values(#{starid},#{sname},#{age},#{salary})")
	public void insertStar(Star star);
	@Select("select * from stars where starid=#{starid}")
	public Star selectById(int starid);
	@Select("select * from stars where salary between #{salary1} and #{salary2}")
	public List<Star> selectBySalary(@Param("salary1") int salary1,@Param("salary2") int salary2);
	@Select("select * from stars where salary = (select max(salary) from stars)")
	public Star selectByMaxSalary();
	@Select("select count(*) from stars")
	public int selectCount();
}
