package com.simplilearn.Basic;


//Thread unsafe - Two threads acting on same object

class Reserve implements Runnable{
	//available berths are1
	
	int available=1;
	int wanted;
	
	//accept berth at runtime
	Reserve(int i){
		wanted=i;
	}

	@Override
	public void run() {
		//display available berths
		
		System.out.println("Available Berths :" +available);
		//if available berths are more than wanted berths 
		
		if(available>=wanted) {
			//get the passenger name
			String name=Thread.currentThread().getName();
			//allot the berth to him
			System.out.println(wanted+"Berths reserved for "+name);
			
			try {
				Thread.sleep(2000);//wait for printing the ticket
			}
			catch(InterruptedException e){}
				
			}
			
			else {
				System.out.println("Sorry,no berths");
			}

		}
		
		
	}


public class ThreadUnsafeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//tell that 1 berth is needed
		Reserve obj=new Reserve(1);
		
		//attach first thread to the object
		Thread t1=new Thread(obj);
		
		//attach second thread to the object
		Thread t2=new Thread(obj);
		
		//take the thread name as person name
		
		t1.setName("First person");
		t2.setName("Second Person");
		
		t1.start();
		t2.start();
	}

}
