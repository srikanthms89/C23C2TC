package com.tnsif.dayeight.instanceofinterface;

public class Jio implements Phone{
	@Override
	public void call()
	{
		System.out.println("calling using Jio");
	}
	
	@Override
	public void sms() {
		System.out.println("Messaging using Jio");
	}
	

}
