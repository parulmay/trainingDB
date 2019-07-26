package com.db.employeemanagementsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public final static String USER_NAME = "root";
	public final static String PASSWORD = "root";
	public final static String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public final static String URI = "jdbc:mysql://localhost:3306/sample";
	public static Connection getConnection()
	{
	Connection connection = null;
	try {
		//step 1 : load the driver class
		// step2 : get the connection from getConnection() of driver manager class
		Class.forName(DRIVER_NAME);
		connection = DriverManager.getConnection(URI,USER_NAME,PASSWORD);
		return connection;
	}
	catch(ClassNotFoundException e)
	{
	e.printStackTrace();	
	}
	 Catch(SQLException e)
	 
	 
	 //add pcose connection method
	}
		
	}
}
