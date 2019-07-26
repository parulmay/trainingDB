package com.db.employeemanagementsystem.dao;

import java.sql.Connection;

public class LoginDAOImpl implements LoginDAO{
	
	public boolean authenticate(LoginBean login) {
		String query = "select * from login_table where username= ? and password = ?";
		Connection connection = null;
		
	}
	
	
}
