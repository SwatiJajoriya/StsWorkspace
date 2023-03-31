package com.simplilearn.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		list.remove(3);
		System.out.println("After remove: "+list);
		System.out.println("List Size: "+list.size());
		System.out.println("check it contains 50 or not" +list.contains(50));
		
		System.out.println("Iterate using for loop");
		for(Integer num:list)
			System.out.println(num);
		System.out.println("Use Iterator");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
