package com.simplilearn.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.simplilearn.bean.Student;
import com.simplilearn.dbutil.StudentDbUtil;

public class StudentDAO {

	//insert the data

	public int insert (Student s) throws ClassNotFoundException, SQLException {

		Connection con=StudentDbUtil.dbconn();
		if (con!=null) {
			System.out.println("Connection with DB is established");

		}
		else {
			System.out.println("Connection failed");
		}

		//prepare statement
		String sql="insert into student values(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, s.getSid());
		ps.setString(2, s.getSname());
		ps.setString(3, s.getSemail());
		ps.setString(4, s.getDob());
		ps.setString(5, s.getAddress());
		int rows=ps.executeUpdate();
		return rows;

	}

	//delete the data

	public int delete (Student s1) throws ClassNotFoundException, SQLException {

		Connection con=StudentDbUtil.dbconn();
		if (con!=null) {
			System.out.println("Connection with DB is established");

		}
		else {
			System.out.println("Connection failed");
		}

		String sql1="delete from student where sid=?";
		PreparedStatement ps=con.prepareStatement(sql1);
		ps.setInt(1, s1.getSid());
		int rows=ps.executeUpdate();
		return rows;

	}

	//update the data
	
	public int update (Student s2) throws ClassNotFoundException, SQLException {

		Connection con=StudentDbUtil.dbconn();
		if (con!=null) {
			System.out.println("Connection with DB is established");

		}
		else {
			System.out.println("Connection failed");
		}

		String sql2="update student set sname=?,dob=?,address=?,semail=? where sid=?";
		PreparedStatement ps=con.prepareStatement(sql2);
		ps.setString(1, s2.getSname());
		ps.setString(2, s2.getDob());
		ps.setString(3,s2.getAddress());
		ps.setString(4,s2.getSemail());
		ps.setInt(5, s2.getSid());
		int rows=ps.executeUpdate();
		return rows;
}
	
	//Retrieve the data
	
	public List<Student>getallstudent() throws ClassNotFoundException, SQLException{
		Connection con=StudentDbUtil.dbconn();
		if (con!=null) {
			System.out.println("Connection with DB is established");

		}
		else {
			System.out.println("Connection failed");
		}
		
		String sql="select * from student";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		ArrayList<Student> list=new ArrayList<>();
		while(rs.next()) {
			Student s=new Student();
			s.setSid(rs.getInt(1));
			s.setSname(rs.getString(2));
			s.setSemail(rs.getString(3));
			s.setDob(rs.getString(4));
			s.setAddress(rs.getString(5));
			list.add(s);
			
		}
		
		con.close();
		return list;
		
		
	}
	
	
}
