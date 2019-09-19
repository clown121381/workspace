package com.student;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StuMapper {
	@Insert("insert into stu(id,name,age) values(#{id},#{name},#{age})")
	public int addStu(Student stu);
	@Delete("delete from stu where id=#{id}")
	public int deleteStu(int id);
	@Update("update stu set name=#{name},age=#{age} where id=#{id}")
	public int updateStu(Student stu);
	@Select("select * from stu where id=#{id}")
	public Student selectAStu(int id);
	@Select("select * from stu")
	public List<Student> selectAllStu();
}
