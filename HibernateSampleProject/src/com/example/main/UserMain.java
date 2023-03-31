package com.example.main;




import com.example.pojo.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class UserMain {
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
		
		User u=new User();
		
		tran.commit();
		session.close();
		sf.close();
		System.out.println();
		
}
}