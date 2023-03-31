package com.simplilearn.collection.queue;


import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo2 {
	
public static void main(String[] args) {
		
		Queue<Integer> queue =new PriorityQueue<>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.contains(40));
		
		 Iterator<Integer> it = queue.iterator();
	        while(it.hasNext())
	            System.out.println(it.next());
	}

}



