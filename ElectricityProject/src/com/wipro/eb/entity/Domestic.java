package com.wipro.eb.entity;

public class Domestic extends Connection {

	public Domestic(int previousReading, int currentReading, float[] slabs) {
		
		
		super(previousReading, currentReading, slabs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float computeBill() {
		
		float finalamount=0.0f;
		int unitsconsumed=currentReading-previousReading;
		if(unitsconsumed<=50) {
			finalamount=unitsconsumed*slabs[0];
		}
		
		//75
		else if(unitsconsumed>50&&unitsconsumed<=100) {
			finalamount=50*slabs[0]+(unitsconsumed-50)*slabs[1];
		}
		//120
		else {
			finalamount=(float)(50*slabs[0]+50*slabs[1]+(unitsconsumed-100)*slabs[2]);
					
		}
		// TODO Auto-generated method stub
		return finalamount;
		
	}

}
