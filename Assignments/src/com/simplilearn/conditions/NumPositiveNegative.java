package com.simplilearn.conditions;

import java.util.*;

public class NumPositiveNegative {
	
	public static void main(String[] args) {
		
		//taking input from user using Scanner class.
		Scanner sc= new Scanner(System.in);
		  while(true) {
        System.out.println("Enter any number");
        int n=sc.nextInt();
      
        if(n>0){
        System.out.println("Number is Positive");
        }
        
        else {
        	System.out.println("Number is Negative");
        }
        
        	sc.close();
		}
	
	
	}
}


