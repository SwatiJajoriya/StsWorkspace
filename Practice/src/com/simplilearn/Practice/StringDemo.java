package com.simplilearn.Practice;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String str= "SWATI Jajoriya";
		str = str.indexOf(str, 1);
		
		
	    System.out.println(str.toLowerCase());
	    System.out.println(str.toCharArray());
	    System.out.println(str.replace(' ', '_'));
	}

}
