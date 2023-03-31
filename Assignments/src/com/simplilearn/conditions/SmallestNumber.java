package com.simplilearn.conditions;

import java.util.*;

public class SmallestNumber {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Integer number");
		int a= sc.nextInt();
		System.out.println("Enter the Second Integer number");
		int b= sc.nextInt();
		System.out.println("Enter the third Integer number");
		int c= sc.nextInt();
		
		if((a<b)&&(a<c)) {
		System.out.println("The smallest number is " +a);
		}
		else if((b<c)&&(b<a)){
		System.out.println("The smallest number is " +b);
		}
		else {
		System.out.println("The smallest number is " +c);
		}
        sc.close();
	}

}



