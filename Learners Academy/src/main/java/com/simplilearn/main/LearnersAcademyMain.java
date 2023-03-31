package com.simplilearn.main;

import java.util.Properties;

import com.simplilearn.pojo.Subjects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class LearnersAcademyMain {

	 private static Session s;

	 public static Session getSession() {
	  if (s== null) {
	   try {
	    Configuration configuration = new Configuration();

	    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		//Meta data in the config file should be executed	
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		//read session factory in the xml
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		//to perform crud operation we need to define an object
		Session s=sf.openSession();
		//used to save the crud operation result on the table
		
	    return s;

	   } catch (Exception e) {
	    e.printStackTrace();
	   }
	  }
	  return s;
	 }
	}