package com.simplilearn.conditions;

import java.util.*;

public class FloatingNumbers {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first floating number");
		double x=sc.nextDouble();
		System.out.println("Enter second floating number");
		double y= sc.nextDouble();
		
		x=Math.round(x*1000);
		x=x/1000;
		
		y=Math.round(y*1000);
		y=y/1000;
		
		if (x == y)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }	
	
		sc.close();
	}
}
