package com.tnsif.dayfour.secondpackage;

import com.tnsif.dayfour.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {
		
		//accessing different package class
		
		Base b1 = new Base();
		
		//private,default,and protected cant access
		
		b1.varPublic=20;
		b1.methodPublic();
		
		
	}

}
