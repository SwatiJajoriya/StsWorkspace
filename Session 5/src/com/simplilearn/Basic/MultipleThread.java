package com.simplilearn.Basic;

//threads working simultaneously upon two objects
//Two threads performing two tasks at a time 

class MyThread5 implements Runnable{
	
	//declare a string to represent the task
	String str;
	MyThread5(String str){
		this.str=str;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(str+":"+i);
			try {
				Thread.sleep(2000);//cease thread execution for 2000 milisecs
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class MultipleThread {
	
public static void main(String[] args) {
	//Create two objects to represent two tasks
	
	MyThread5 obj1=new MyThread5("cut the ticket");
	MyThread5 obj2= new MyThread5("show the seat");
	
	//create two threads and attach then to the two objects
	
	Thread t1=new Thread(obj1);
	Thread t2=new Thread(obj2);
	
	t1.start();
	t2.start();
	
	
}
}
