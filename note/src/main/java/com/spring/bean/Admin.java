package com.spring.bean;

public class Admin {
	private Integer userid;
	private String username;
	private String userpass;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Admin [userid=" + userid + ", username=" + username + ", userpass=" + userpass + "]";
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
}
