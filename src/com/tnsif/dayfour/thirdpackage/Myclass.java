//program to demonstrate singleton class
package com.tnsif.dayfour.thirdpackage;

public class Myclass {
	
	private static Myclass obj= new Myclass();
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//private constructor
	private Myclass() {
		System.out.println("Myclass object created");
	}
	
	public static Myclass getObject() //factory method
	{
		return obj;
	}
	@Override
	public String toString() {
		return "Myclass [id=" + id + "]";
	}
	
	
	
	

}
