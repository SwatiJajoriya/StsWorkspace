package com.simplilearn.conditions;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColorArrayList {
	
	public static void main(String[] args) {
		
		List <String> list= new ArrayList<>();
		
		
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
       Collections.swap(list, 0, 2);
		
		
		System.out.println(list);
		
		System.out.println("List Size: "+list.size());
		System.out.println("Sublist : "+list.subList(0, 3));
		
		Iterator<String> itr= list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
	}

}
}
