package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.bean.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean insertStudent(Student student) {
		String sql = "insert into student(s_id,s_name,s_sex,s_age) values(?,?,?,?)";
		int b = this.jdbcTemplate.update(sql,student.getS_id(),student.getS_name(),student.getS_sex(),student.getS_age());
		if(b > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		String sql = "update student set s_name=?,s_age=?,s_sex=? where s_id=?";
		int b = this.jdbcTemplate.update(sql,student.getS_name(),student.getS_age(),student.getS_sex(),student.getS_id());
		if(b > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteStudent(Integer s_id) {
		String sql = "delete from student where s_id=?";
		int b = this.jdbcTemplate.update(sql,s_id);
		if(b > 0) {
			return true;
		}
		return false;
	}

	@Override
	public Student findById(Integer s_id) {
		String sql = "select * from student where s_id=?";
		return this.jdbcTemplate.queryForObject(sql, 
						new RowMapper<Student>(){
							@Override
							public Student mapRow(ResultSet rs, int i) throws SQLException {
								Student stu = new Student(rs.getInt("s_id"),rs.getString("s_name"),rs.getString("s_sex"),rs.getInt("s_age"));
								return stu;
							}
						},s_id);
	}

	@Override
	public List<Student> findAll() {
		String sql = "select * from student";
		return this.jdbcTemplate.query(sql, 
						new RowMapper<Student>(){
							@Override
							public Student mapRow(ResultSet rs, int i) throws SQLException {
								Student stu = new Student(rs.getInt("s_id"),rs.getString("s_name"),rs.getString("s_sex"),rs.getInt("s_age"));
								return stu;
							}
						});
	}
}
