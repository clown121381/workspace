package com.bean;

import java.io.Serializable;

public class Table_Income implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer Income_id;
	private Integer Dept_id;
	private String Daily_income;
	private String Business_date;
	private String Lst_mod_timestemp;
	
	@Override
	public String toString() {
		return "Income [Income_id=" + Income_id + ", Dept_id=" + Dept_id + ", Daily_income=" + Daily_income
				+ ", Business_date=" + Business_date + ", Lst_mod_timestamp=" + Lst_mod_timestemp + "]";
	}
	public Integer getIncome_id() {
		return Income_id;
	}
	public void setIncome_id(Integer income_id) {
		Income_id = income_id;
	}
	public Integer getDept_id() {
		return Dept_id;
	}
	public void setDept_id(Integer dept_id) {
		Dept_id = dept_id;
	}
	public String getDaily_income() {
		return Daily_income;
	}
	public void setDaily_income(String daily_income) {
		Daily_income = daily_income;
	}
	public String getBusiness_date() {
		return Business_date;
	}
	public void setBusiness_date(String business_date) {
		Business_date = business_date;
	}
	public String getLst_mod_timestemp() {
		return Lst_mod_timestemp;
	}
	public void setLst_mod_timestemp(String lst_mod_timestemp) {
		Lst_mod_timestemp = lst_mod_timestemp;
	}
}
