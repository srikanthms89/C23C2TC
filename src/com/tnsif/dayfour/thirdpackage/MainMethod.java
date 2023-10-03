package com.tnsif.dayfour.thirdpackage;

public class MainMethod {

	public static void main(String[] args) {
		
		//can't create object with private constructor
		//Myclass m1= new Myclass();
		
		Myclass m= Myclass.getObject();
		m.setId(10);
		
		Myclass m11= Myclass.getObject();
		
		
		
		System.out.println(m);
		//System.out.println(m11);
	}

}
