package com.simplilearn.conditions;

public class NaturalNumbers {
	
	public static void main(String[] args) {
		
		int[] n= {1,2,3,4,5,6,7,8,9,10};
		
		int i, sum = 0;
		System.out.println("The first 10 natural numbers are :");
		
		for(i=1;i<=n.length;i++) {
			
			System.out.println(i);
			sum+=i;
		}
		
System.out.println("The Sum of Natural Numbers : " +sum);

				
			
		
	}

}

	