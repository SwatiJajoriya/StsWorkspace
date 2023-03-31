
package com.simplilearn.collection.list;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		 
		LinkedList<String> list= new LinkedList<>();
		
		list.add("abc@gmail.com");
		list.add("xyz@gmail.com");
		list.add("efg@gmail.com");
		list.add("jkl@gmail.com");
		list.add("def@gmail.com");
		list.add("mno@gmail.com");
		list.add("ghi@gmail.com");
		list.add("pqr@gmail.com");
		list.add("stu@gmail.com");
		list.add("vwx@gmail.com");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email id: ");
		String email= sc.nextLine();
		
        Pattern pattern = Pattern.compile("[a-zA-Z0-9.@_]+");
		
		Matcher matcher=pattern.matcher(email);{
	    if(matcher.matches())	{
	    System.out.println("Pattern matched");
	    }
	    else {
	    System.out.println("Pattern not matched");
	   }
		}
		
		boolean flag=false;
		Iterator <String> it=list.iterator();
		while(it.hasNext()) {
			String n=it.next();
			if (email.equals(n)) {
				
				flag=true;
				System.out.println("Email id exist");
				email=sc.nextLine();
				return;
				}
		   	}
	
			if(flag==false) {
			   System.out.print("Email id not exist");
			   email=sc.nextLine();
				
	    	}	
			sc.close();
		}
	}
		
	

	
	
	
	
	

