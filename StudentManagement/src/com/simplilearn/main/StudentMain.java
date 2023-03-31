package com.simplilearn.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


import com.simplilearn.bean.Student;
import com.simplilearn.doa.StudentDAO;

public class StudentMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		StudentDAO dao=new StudentDAO();
		
		while(true) {
			System.out.println("enter the choice:\n 1.insert\n 2.delete\n 3.update\n 4.retrieve\n 5.Exit\n ");
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			System.out.println(ch);
			
			switch(ch) {
			
			case 1:
				
				Student s=new Student();
				System.out.println("enter the id value");
				s.setSid(sc.nextInt());
				System.out.println("enter the name value");
				s.setSname(sc.next());
				System.out.println("enter the email value");
				s.setSemail(sc.next());
				System.out.println("enter the dob");
				s.setDob(sc.next());
				System.out.println("enter the address");
				s.setAddress(sc.next());
				int row=dao.insert(s);
				if(row>0) {
					System.out.println("inserted successfully");
				}
				else {
					System.out.println("insertion failed");
				}	
				break;
			
			case 2:
				
				Student s1=new Student();
				System.out.println("enter the id value");
				s1.setSid(sc.nextInt());
				int row1=dao.delete(s1);
				if(row1>0) {
					System.out.println("deleted successfully");
				}
				else {
					System.out.println("deletion failed");
				}	
				break;
				
			case 3:
				
				Student s2=new Student();
				System.out.println("enter the name");
				s2.setSname(sc.next());
				System.out.println("enter the dob");
				s2.setDob(sc.next());
				System.out.println("enter the address");
				s2.setAddress(sc.next());
				System.out.println("enter the email");
				s2.setSemail(sc.next());
				System.out.println("enter the id");
				s2.setSid(sc.nextInt());
				int row2=dao.update(s2);
				if(row2>0) {
					System.out.println("updated successfully");
				}
				else {
					System.out.println("updation failed");
				}	
				break;
				
			case 4:
				
				List<Student> list=dao.getallstudent();
				for(Student stud:list) {
				System.out.println(stud.getSid()+" "+stud.getSname()+" "+stud.getSemail()+" "+stud.getDob()+" "+stud.getAddress());
				}
				break;
				
			case 5: System.exit(0); 
				
		}
				
				
		
	}
	
	}

}
