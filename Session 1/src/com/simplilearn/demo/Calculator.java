package com.simplilearn.demo;
import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.println("Enter any two numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println("Enter any operator + - */");	
			String operator = sc.next();
			char c = operator.charAt(0);
	 	
	if (c == '+') {
	int	R = num1+num2;
    System.out.println(+R);
	}
	else if (c == '-') {
		int	R = num1-num2;
	    System.out.println(+R);
		}
	else if (c == '*') {
		int	R = num1*num2;
	    System.out.println(+R);
		}
	else if (c == '/') {
		int	R = num1/num2;
	    System.out.println(+R);
		}
	else {
		System.out.println("Please enter correct operator");
	}	
	}
	}
	
}
