package com.wipro.eb.main;

import com.wipro.eb.entity.Domestic;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;
import com.wipro.eb.service.ConnectionService;

public class EBMain {
	
	public static void main(String args[]) throws InvalidReadingException, InvalidConnectionException
	{
	System.out.println(new ConnectionService().generateBill(320,200,"Commercial"));
	}
	
}
