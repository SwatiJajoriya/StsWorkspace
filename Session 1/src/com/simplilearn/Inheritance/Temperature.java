package com.simplilearn.Inheritance;
import java.util.Scanner;
public class Temperature {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter Temperature in Celcius");
		float temp1 = sc.nextFloat();
		float c = temp1;
		float temp2 = (c*9/5)+32;
		System.out.println("Temperature in Fahrenheit is: " +temp2);
		
	
	}
		}

	

