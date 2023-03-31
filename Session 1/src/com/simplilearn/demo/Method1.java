package com.simplilearn.demo;

public class Method1 {
	public void print() {
		//method return nothing & without any parameter.
		System.out.println("Print method called");
	}
	public void calculate(int a ,int b){
		
		System.out.println("Addition" +(a+b));
		
	}
	public void fullname(String fname,String mname,String lname){
		System.out.println("Fullname is " +fname+" "+mname+" "+lname);
	}
	
	public static void main(String[] args) {
		Method1 m= new Method1();
		m.print();
		m.fullname("John", "albert", "einstein" );
		m.calculate(10,20);
	}
}
