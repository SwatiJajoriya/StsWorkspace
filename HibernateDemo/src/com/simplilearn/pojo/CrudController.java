package com.simplilearn.pojo;

import org.hibernate.Session;

public class CrudController {
	
	public String insert(Session session,Employee e) {
		int row=(int) session.save(e);
		if(row>0) {
			return "insertion done";
		}
		else {
		return "insertion failed";
		}
	}
	
	public String update(Session session,Employee e) {
		session.saveOrUpdate(e);
		return "updated";
	}
	//get,load,find
	public Employee retrive(Session session,int id) {
		return session.get(Employee.class,id);
	}


}
