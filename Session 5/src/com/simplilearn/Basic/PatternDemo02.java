package com.simplilearn.Basic;

import java.util.regex.*;

public class PatternDemo02 {
	
	public static void main(String[] args) {
		
		//create a pattern to be searched
		
		Pattern p= Pattern.compile("hi*");
		
		String s1="hihellohihowhiheyhi";
		Matcher m=p.matcher(s1);
		
		//check whether the pattern is there or not
		//using find() method
		
		while(m.find()) {
			
			//print starting and ending indexes of the pattern
			//in text using
			System.out.println("Pattern found from:"+m.start()+"to" +(m.end()-1));
			
		}

		}

}
