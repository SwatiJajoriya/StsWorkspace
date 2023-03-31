package com.simplilearn.conditions;

import java.util.*;

public class CubeOfNumber {
	
	public static void main(String args[])
	   {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number: ");
	      
	      int number = sc.nextInt();
	      //finding cube of number by multiplying it 3 times with itself
	      //and printing result
        System.out.println("Cube of number: "+ (number*number*number));
	   }
	    
	
}
