package com.simplilearn.abstraction;

public class MethodOverload {
	
	public int add(int a, int b){
		return a+b;
		
}
	public double add(double a, double b){
		return a+b;
		
}
	public float add(float a, float b){
		return a+b;
		
}
	public static void main(String[] args) {
		MethodOverload m =new MethodOverload();
		System.out.println("Double Addition: "+m.add(2.3,4.2));
		System.out.println("Float Addition: "+m.add(2.3f,4.2f));
		System.out.println("Int Addition: "+m.add(34,34));
	}

}
