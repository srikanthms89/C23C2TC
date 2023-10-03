package com.tnsif.dayfour.firstpackage;

public class Excecutor {

	public static void main(String[] args) {

		 // accessing same package class
		Base b1 = new Base();
		b1.methodDefault();
		b1.methodPublic();
		b1.methodProtected();
		
		b1.varDefault=11;
		b1.methodDefault();
		b1.varPublic =12;
		b1.methodPublic();
		b1.varProtected=13;
		b1.methodProtected();
		
		//private member cant accessible 
		/*
		 * b1.varPrivate=21;
		 */
         //instance of operator
		System.out.println(b1 instanceof Base );// returns True
		
		
		/*Person p =new Person();
		 System.out.println(p instanceof Base); //
 		 
*/
	}

}
