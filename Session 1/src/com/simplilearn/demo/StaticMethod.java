package com.simplilearn.demo;

public class StaticMethod {
	
	public static void test() {
		System.out.println("Test method called");
	}
	public static void main(String[] args) {
		//static method called directly without creating object of the class.
		//classname.methodname
		StaticMethod.test();
		
	}
}
