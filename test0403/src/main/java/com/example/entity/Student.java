package com.example.entity;

public class Student extends Person{
	private Integer classNumber;
	private Double grade;
	public Integer getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(Integer classNumber) {
		this.classNumber = classNumber;
	}
	@Override
	public String toString() {
		return super.toString()+"Student [classNumber=" + classNumber + ", grade=" + grade + "]";
	}
	public Double getGrade() {
		return grade;
	}
	public void setGrade(Double grade) {
		this.grade = grade;
	}
	public Student(Integer id, String name,Integer classNumber, Double grade) {
		super(id,name);
		this.classNumber = classNumber;
		this.grade = grade;
	}
	public Student() {
		
	}
	
}
