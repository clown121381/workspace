package com.student.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mapper.StudentMapper;
import com.student.Student;

import MybatisUtil.Mybatis_Util;

public class StudentDao {
	SqlSession session = Mybatis_Util.getSqlSession(true);
	StudentMapper map = session.getMapper(StudentMapper.class);
	
	public List<Student> selectAll() {
		return map.selectAll();
	}
	
	public void deleteStu(String s_id) {
		map.deleteStu(s_id);;
	}
	
	public void newStu(String s_name,String s_sex,String s_age) {
		map.newStu(s_name, s_sex, s_age);
	}
	
	public Student selectOne(String sid) {
		return map.selectOne(sid);
	}
	
	public void updateStu(String s_id,String s_name,String s_sex,String s_age) {
		map.updateStu(s_id, s_name, s_sex, s_age);
	}
}
