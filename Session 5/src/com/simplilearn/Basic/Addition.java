package com.simplilearn.Basic;

import java.util.Scanner;

public class Addition {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter any two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
	System.out.println("Addition:" +(num1+num2));
	
	sc.close();
	
		
		
	}

}
