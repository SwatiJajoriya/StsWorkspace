package com.simplilearn.Basic;


public class ThrowDemo {
	
	public static void main(String[] args) {
		
        int a=45,b=0,rs;
		
		try {
		if (b==0) {
			throw(new ArithmeticException("Can't divide by Zero"));
		}
		else {
			rs=a/b;
			System.out.println(rs);
		}
		
		}
		catch(ArithmeticException ex) {
			System.out.println("\n\tError:" +ex.getMessage());
			
		
		}
		
		System.out.println("End of Program");
	}

}
