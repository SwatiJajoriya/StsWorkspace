package com.simplilearn.conditions;

import java.util.*;

public class AverageOfNumbers {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Integer number");
		int a= sc.nextInt();
		System.out.println("Enter the Second Integer number");
		int b= sc.nextInt();
		System.out.println("Enter the third Integer number");
		int c= sc.nextInt();
		
		int sum =(a+b+c)/3;
		
		System.out.println("The average of the number is " +sum);
		}
        
	}
	


