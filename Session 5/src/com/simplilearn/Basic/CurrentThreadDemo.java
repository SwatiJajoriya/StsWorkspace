package com.simplilearn.Basic;

public class CurrentThreadDemo {
	
	public static void main(String[] args) {
		
	System.out.println("Let's find current thread");
	
	Thread t= Thread.currentThread();
	System.out.println("Current Thread: "+t);
	
	System.out.println("it's Name: "+t.getName());
	
	
	}

}
