package com.simplilearn.Basic;

import java.util.*;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Creating TreeMap:");
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		
		map.put(105,"Hyundai");
		map.put(101,"Suzuki");
		map.put(103,"Kia");
		map.put(102,"Civic");
		
		System.out.println("\n The elements of Treemap are: ");
		
		System.out.println("For Each : ");
		
		for(Map.Entry<Integer,String> m:map.entrySet()){
			
	     System.out.println(m.getKey()+"  "+m.getValue());
		}
		
	}

}
