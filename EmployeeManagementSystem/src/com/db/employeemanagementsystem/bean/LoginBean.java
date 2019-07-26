package com.db.employeemanagementsystem.bean;

public class LoginBean {
	String userName;
	String Password;
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public LoginBean(String userName, String password) {
		super();
		userName = userName;
		Password = password;
	}
	public String toString() {
		return "LoginBean [userName=" + userName + ", Password=" + Password + "]";
	}
	

}
