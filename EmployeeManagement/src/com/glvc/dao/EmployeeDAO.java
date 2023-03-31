package com.glvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.glvc.bean.Employee;
import com.glvc.dbutil.DbUtil;

//DAO-data access object
//used this package for CRUD operations

//Register Driver
//Connection with the dB      -DbUtil
//Statement of SQL            -     CRUD
//Execute the statement
//Close the connection


public class EmployeeDAO {
	
	// insertion of the data
	
	public int insert(Employee e) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
	//Statement of SQL            -     CRUD
		
		//Statement st=con.createStatement();
	    //String sql1="insert into employee values("+e.getEmpid()+",'"+e.getEmpname()+"',"+"'"+e.getEmpemail()+"',"+e.getSalary()+")";
		//System.out.println(sql1);
		
		//Execute the statement
		//insert,update,delete =>executeUpdate(sql)=>numeric value =>int =no of rows
		
		//prepare statement
    	String sql1="insert into employee values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql1);
		ps.setInt(1,e.getEmpid());
		ps.setString(2,e.getEmpname());
		ps.setString(3,e.getEmpemail());
		ps.setFloat(4, e.getSalary());
        int rows=ps.executeUpdate();
		return rows;
	}
	// Update of the data
	
	public int update(Employee e1) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		//Statement st=con.createStatement();
		//String sql2="update employee set empname='"+e1.getEmpname()+"'"+"where Empid="+e1.getEmpid();
		//System.out.println(sql2);
		
		String sql2="update employee set empname=?,empemail=? where empid=?";
		PreparedStatement ps=con.prepareStatement(sql2);
		ps.setString(1,e1.getEmpname());
		ps.setString(2, e1.getEmpemail());
		ps.setInt(3, e1.getEmpid());
		int rows=ps.executeUpdate();
		return rows;
	}
	
	//Deletion of the data
	
	public int delete(Employee e2) throws ClassNotFoundException, SQLException {
		Connection con=DbUtil.dbConn();
		if(con!=null) {
			System.out.println("connection with dB is established ");
		}
		else {
			System.out.println("connection failed ");
		}
		//Statement st=con.createStatement();
		//String sql3="delete from employee where Empid="+e2.getEmpid();
		//System.out.println(sql3);
		String sql3="delete from employee where Empid=?";
		PreparedStatement ps=con.prepareStatement(sql3);
		ps.setInt(1, e2.getEmpid());
		int rows=ps.executeUpdate();
		return rows;
	}
	
	
	//Retrieve of the data
	
		public List<Employee> getallemp() throws SQLException, ClassNotFoundException{
			Connection con=DbUtil.dbConn();
			if(con!=null) {
				System.out.println("connection with dB is established ");
			}
			else {
				System.out.println("connection failed ");
			}
			
			//Statement st=con.createStatement();
			String sql="select * from employee";
			PreparedStatement ps=con.prepareStatement(sql);

			//address of the table if it exists
			ResultSet rs=ps.executeQuery();
			ArrayList<Employee> list=new ArrayList<>();
			while(rs.next()) {
				Employee e=new Employee();
				e.setEmpid(rs.getInt(1));
				e.setEmpname(rs.getString(2));
				e.setEmpemail(rs.getString(3));
				e.setSalary(rs.getFloat(4));
				list.add(e);
				
			}
			
			//ResultSetMetaData
			//To describe the table column.
			
			ResultSetMetaData rsm=rs.getMetaData();
			System.out.println("the no of columns"+rsm.getColumnCount());
			System.out.println("the 1st col name "+rsm.getColumnName(1)+"  "+"col type"+rsm.getColumnTypeName(1));

			con.close();
			return list;

		}
	}


