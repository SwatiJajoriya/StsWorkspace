package com.simplilearn.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDbUtil {
	
	public static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/db3";
	public static final String DB_USERNAME="root";
	public static final String DB_PASSWORD="Mindscape$9001";

	
	public static Connection dbconn() throws ClassNotFoundException, SQLException {
		
		//register the driver class
	    Class.forName(DRIVER_CLASS);
	    
	    //connection statement
		Connection con=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
		return con;
		
	}
	}
	
	

