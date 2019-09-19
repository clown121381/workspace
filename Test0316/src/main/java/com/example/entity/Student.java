package com.example.entity;
/**
 * 在com.example.entity下，创建学生实体类，包含学号，姓名，成绩，班级编号；
 * 创建4个参数的构造函数用于初始化。允许使用快捷键alt+insert，生成getter/setter方法，
 * 以及构造函数
 * @author 爱不会绝迹
 *
 */
public class Student {
	private Integer id;
	private String name;
	private Double grade;
	private Integer classNum;
	
	public Student() {
		
	}
	public Student(Integer id, String name, Double grade, Integer classNum) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getGrade() {
		return grade;
	}
	public void setGrade(Double grade) {
		this.grade = grade;
	}
	public Integer getClassNum() {
		return classNum;
	}
	public void setClassNum(Integer classNum) {
		this.classNum = classNum;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", classNum=" + classNum + "]";
	}
}
