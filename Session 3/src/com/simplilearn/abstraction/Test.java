package com.simplilearn.abstraction;

public class Test {
 public static void main(String[] args) {
	Shape s1 = new Circle("Blue" , 3.4);
	Shape s2 = new Circle("Pink" , 2.4);
	Shape s3 = new Rectangle("red",6,2.3);
	Shape s4 = new Rectangle("yellow",4,4.3);
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
}
}
