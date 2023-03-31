package com.simplilearn.main;


import java.util.Scanner;

import com.simplilearn.pojo.CrudController;
import com.simplilearn.pojo.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/*1.StandardServiceRegistry
2.Metadata
3.SessionFactory
4.Session
5.Transaction
6.Close the connection 
*/
public class EmployeeMain {
	public static void main(String[] args) {
		//SSR is used to map the config file and execute it 
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		//Meta data in the config file should be executed	
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		//read session factory in the xml
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		//to perform crud operation we need to define an object
		Session session=sf.openSession();
		//used to save the crud operation result on the table
		Transaction tran=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
	//	Employee e=new Employee();
	//	System.out.println("enter the value of the id ");
	//	e.setEmpno(sc.nextInt());
	//	System.out.println("enter the value of the name ");
	//	e.setEmpname(sc.next());
	//	System.out.println("enter the value of the email ");
	//	e.setEmail(sc.next());
	//	//insert
	
		
//				CrudController crud=new CrudController();
//				String s=crud.insert(session,e);
//				System.out.println(s);
				
//				String s=crud.update(session,e);
//				System.out.println(s);
	//			System.out.println(crud.retrive(session, e.getEmpno()));
		
		
//		for(int i=0;i<10;i++) {
	//	Employee e=new Employee();
	//		e.setEmpname("name"+i);
	//	e.setEmail("name"+i+"@g.c");
	//		session.save(e);
//	}


	
		tran.commit();
		session.close();
		sf.close();
		
	}
}


