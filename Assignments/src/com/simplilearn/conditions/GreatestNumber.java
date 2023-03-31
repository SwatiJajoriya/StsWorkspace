package com.simplilearn.conditions;

import java.util.*;

public class GreatestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Integer number");
		int a= sc.nextInt();
		System.out.println("Enter the Second Integer number");
		int b= sc.nextInt();
		System.out.println("Enter the third Integer number");
		int c= sc.nextInt();
		
		if((a>b)&&(a>c)) {
		System.out.println("The greatest number is " +a);
		}
		else if((b>c)&&(b>a)){
		System.out.println("The greatest number is " +b);
		}
		else {
		System.out.println("The greatest number is " +c);
		}
        sc.close();
	}

}
