package com.glvc.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//register the driver
//connection with the dB→single responsibility principle -DbUtil-database utility


public class DbUtil {
	
public static final String DRIVER_CLASS="com.mysql.jdbc.Driver";
public static final String DB_URL="jdbc:mysql://localhost:3306/db3";
public static final String USERNAME="root";
public static final String PASSWORD="Mindscape$9001";

	public static Connection dbConn() throws ClassNotFoundException, SQLException {
		
		//register the driver
		
		Class.forName(DRIVER_CLASS);
		
		//connection statement
		Connection con=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		return con;
		
	}

}
