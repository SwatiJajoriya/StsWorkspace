package mypackage;

import java.util.Scanner;

public class SecondHighestnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Is prime no.");
		}
		else {
			System.out.println("not prime no.");
		}
		}
	}