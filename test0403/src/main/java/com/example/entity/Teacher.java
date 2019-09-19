package com.example.entity;

public class Teacher extends Person{
	private String professional;
	@Override
	public String toString() {
		return super.toString()+"Teacher [professional=" + professional + ", publishCount=" + publishCount + "]";
	}
	public Teacher() {
		super();
	}
	public Teacher(Integer id, String name,String professional, Integer publishCount) {
		super(id,name);
		this.professional = professional;
		this.publishCount = publishCount;
	}
	private Integer publishCount;
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	public Integer getPublishCount() {
		return publishCount;
	}
	public void setPublishCount(Integer publishCount) {
		this.publishCount = publishCount;
	}
}
