package com.Idao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.clazz.Clazz;
import com.student.Student;

public interface Idao {
	@Select("select * from student where class_id=#{id}")
	@Results({
		@Result(id=true,column="s_id",property="id"),
		@Result(column="s_name",property="name"),
		@Result(property="clazz",column="class_id",one=@One(select="com.Idao.Idao.selectAClass"))
	})
	public List<Student> selectStudent(int id);
	
	@Select("select * from class where c_id=#{id}")
	@Results({
		@Result(id=true,column="c_id",property="id"),
		@Result(column="c_name",property="name"),
		@Result(property="students",column="c_id",
			many=@Many(select="com.Idao.Idao.selectStudent"))
	})
	public Clazz selectClass(int id);
	
	@Select("select * from class where c_id=#{id}")
	public Clazz selectAClass(int id);
	
}
