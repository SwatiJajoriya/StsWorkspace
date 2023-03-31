package com.simplilearn.conditions;
import java.util.*;

public class QuadraticEquation {
	
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the value of a");
	Integer a= sc.nextInt();
	System.out.println("Enter the value of b");
	Integer b= sc.nextInt();
	System.out.println("Enter the value of c");
	Integer c= sc.nextInt();

double d = b*b-4.0*a*c;

double r1 = (-b+Math.sqrt(d))/(2.0*a);

double r2 = (-b-Math.sqrt(d))/(2.0*a);

if (d> 0.0)   
{  
System.out.println("The roots are " + r1 + " and " + r2);  
}   
else if (d == 0.0)   
{  
System.out.println("The root is " + r1);  
}   
else   
{  
System.out.println("Roots are not real.");  
}  
sc.close();
}
}
