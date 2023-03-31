package com.simplilearn.Basic;

//Program one thread doing multiple tasks.
//Single tasking using Thread

class MyThread4 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//execute the tasks one by one by calling methods
		task1();
		task2();
		task3();
	}
	void task1() {
		System.out.println("This is task1");
	}
	
	void task2() {
		System.out.println("This is task2");
	}
	
	void task3() {
		System.out.println("This is task3");
	}
}


public class SingleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Create an object MyThread class
		
		MyThread4 obj=new MyThread4();
		
//Create a Thread t1 and attach it to that object
		Thread t1=new Thread(obj);
		
		//execute the thread t1 on that object's run method
		t1.start();
		
	}

}
