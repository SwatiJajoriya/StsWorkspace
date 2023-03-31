package com.simplilearn.Basic;

import java.util.regex.*;

public class RegexPatternDemo1 {
	
	public static void main(String[] args) {
		String pattern= "[a-z]+";
		String check= "regular expression is helpful";
		
		//Creating a pattern to be searched in matcher
		Pattern p= Pattern.compile(pattern);
		
		Matcher m= p.matcher(check);
		while(m.find()) {
			System.out.print(check.substring(m.start(),m.end())+" ");
		}
		
	}

}
