package com.simplilearn.conditions;

import java.util.*;

public class Alphabet {
	
	public static void main(String[] args) {
		
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter any alphabet");
       String str=sc.nextLine();
       
       switch(str) {
       
       case "a","A":
       case "e","E":
       case "i","I":
       case "o","O":
       case "u","U":
    	   
           System.out.println("Input letter is vowel");
           break;
           
       default:
           System.out.println("Input letter is consonant");
   
       }
sc.close();
	}
}