package com.tnsif.day2;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int x=11;
		System.out.println(" a and b value befor the operations :" +a +" "+b);
		
		++a;
		int c= ++a + b + a --;  // 12+20+12=44
		System.out.println(" c value after the operations " +c);
		
		int d= c++ + a + b--; // 45+ 11 +19
		System.out.println(" d value after the operations " +d);
		
		System.out.println("a,b,c,d values after operations :"+a +"  "+ b+ " "+c+"  "+d);
		
		//ternary operator
		x=(10 == x) ? 1:0;
		System.out.println(x);
	}

}
