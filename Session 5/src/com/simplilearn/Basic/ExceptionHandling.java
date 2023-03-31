package com.simplilearn.Basic;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		int[] arr=new int[5];
		
		try {
			arr[8]=100;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is out of bounds");
		}
		finally {
			System.out.println("The array size is :"+arr.length);
		}
		
	}

}
