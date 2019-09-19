package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.student.Student;

public interface StudentMapper {
	public List<Student> selectAll();
	public void deleteStu(String s_id);
	public void newStu(@Param("s_name") String s_name,@Param("s_sex") String s_sex,@Param("s_age") String s_age);
	public Student selectOne(String s_id);
	public void updateStu(@Param("s_id") String s_id,@Param("s_name") String s_name,@Param("s_sex") String s_sex,@Param("s_age") String s_age);
}
