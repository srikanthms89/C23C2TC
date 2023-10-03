package com.tnsif.daythree.constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);
     String name,city;
     int id;
     System.out.println("Enter Customer_Id");
     id= sc.nextInt();
     
     sc.nextLine();
     System.out.println("Enter customer name");
     name = sc.nextLine();
     
     sc.nextLine();
     System.out.println("Enter customer city");
     city = sc.nextLine();
     
     System.out.println("   ");
     
     //object
     Customer c1 = new Customer(); //default constructor
     c1.setCustomerName(name);
     c1.setCustomerId(id);
     c1.setCustomerCity(city);
     System.out.println(c1);
     
     
     System.out.println("Enter customerid ");
     id = sc.nextInt();
     sc.nextLine();
     
     System.out.println("Enter customer name");
     name = sc.nextLine();
     
     System.out.println("Enter customer city");
     city = sc.nextLine();
     
     Customer c2 = new Customer(name,id ,city);//parameterized constructor
     System.out.println(c2);
     
     sc.close();

	}

}
