//program to demonstrate package and access modifiers
package com.tnsif.dayfour.firstpackage;

public class Base {

	/*
	 *  Declaring default, public, private and protected variables
	 
	 */
	
	int varDefault =10;
	public int  varPublic =20;
	private int varPrivate =30;
	protected int varProtected=40;
	/*
	 * Declaring methods with default , public ,private and protected types
	 */
	 
	   void methodDefault()
	   {
		   System.out.println("Default access Base class");
		   System.out.println("Default variable :"+varDefault );
	   }
	   
	  public void methodPublic()
	  {
		  System.out.println("public access Base class");
		  System.out.println("public variable :"+ varPublic);
	  }
	  private void methodPrivate()
	  {
		  System.out.println("private access Base class");
		  System.out.println("private variable :"+ varPrivate);
	  }
	  
	  protected void methodProtected()
	  {
		  System.out.println("protected access Base class");
		  System.out.println("protected variable :"+ varProtected);
	  }
	  
}

