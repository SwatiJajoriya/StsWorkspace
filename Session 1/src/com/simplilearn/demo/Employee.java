package com.simplilearn.demo;

public class Employee {
	
private int id;
private String name;
private String email;
public Employee() {
	System.out.println("Default Constructor");
}
public Employee(int id,String name,String email){
	this.id=id;
	this.name=name;
	this.email=email;
}
public void printdata() {
	System.out.println("ID:" +id);
	System.out.println("Name:" +name);
	System.out.println("Email:" +email);
}
public static void main(String[] args) {
	Employee e1= new Employee(1,"alex", "alex@gmail.com");
	Employee e2= new Employee(2,"John", "john@gmail.com");
	Employee e3= new Employee();
	e1.printdata();
	e2.printdata();
	e3.printdata();
}
}
