package com.simplilearn.Basic;

public class ExceptionTest02 {
	
	public static void main(String[] args) {
		
		int a=45,b=0,rs;
		
		try {
		rs=a/b;
		System.out.println(rs);
		}
		
		catch(ArithmeticException ex) {
			System.out.println("You cannot divide a number by Zero");
		}
	}

}
