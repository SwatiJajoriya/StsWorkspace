package com.glvc.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.glvc.bean.Employee;
import com.glvc.dao.EmployeeDAO;
import com.glvc.dbutil.DbUtil;

public class CRUDMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		EmployeeDAO dao=new EmployeeDAO();
		
		while(true) {
		System.out.println("enter the choice:\n 1.insert\n 2.update\n 3.delete\n 4.retrieve\n 5.Exit\n ");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		System.out.println(ch);
		
		switch(ch) {
		
		case 1:
			Employee e=new Employee();
			System.out.println("enter the id value");
			e.setEmpid(sc.nextInt());
			System.out.println("enter the name value");
			e.setEmpname(sc.next());
			System.out.println("enter the email value");
			e.setEmpemail(sc.next());
			System.out.println("enter the salary");
			e.setSalary(sc.nextFloat());
			
			int row=dao.insert(e);
			if(row>0) {
				System.out.println("inserted successfully");
			}
			else {
				System.out.println("insertion failed");
			}	
			break;
		
			case 2:
				Employee e1=new Employee();
				System.out.println("enter the id value");
				e1.setEmpid(sc.nextInt());
				System.out.println("enter the name value");
				e1.setEmpname(sc.next());
				System.out.println("enter the email value");
				e1.setEmpemail(sc.next());
				//System.out.println("enter the salary");
				//e1.setSalary(sc.nextFloat());
				
				int row1=dao.update(e1);
				if(row1>0) {
					System.out.println("update successfully");
				}
				else {
					System.out.println("update failed");
				}	
				break;
			
			case 3:
				Employee e2=new Employee();
				System.out.println("enter the id value to delete");
				e2.setEmpid(sc.nextInt());
				int row2=dao.delete(e2);
				if(row2>0) {
					System.out.println("delete successfully");
				}
				else {
					System.out.println("delete failed");
				}	
				break;
			
			case 4:
				System.out.println("fetch the employee details");
				List<Employee> list=dao.getallemp();
				for(Employee emp:list) {
				System.out.println(emp.getEmpid()+"  "+emp.getEmpname()+"  "+emp.getEmpemail()+"  "+emp.getSalary());
				}
				break;
				
			case 5: System.exit(0); 
				
		}
		
		
		}

		
	}
}

