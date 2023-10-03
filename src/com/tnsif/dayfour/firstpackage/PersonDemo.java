package com.tnsif.dayfour.firstpackage;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

		Person p1 = new Person();  //default constructor
		
		Scanner sc = new Scanner(System.in);
		String name,city;
		int age;
		System.out.println(" Enter person details:name,age and city");
		name = sc.nextLine();
		//sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		
		p1.setPersonName(name);
		p1.setPersonAge(age);
		p1.setPersonCity(city);
		
		System.out.println("person details Name:" +p1.getPersonName() + "\t Age:"+p1.getPersonAge() +"\tCity:"+p1.getPersonCity());
		
		
		System.out.println("Enter the person details:name,age,city");
		name= sc.nextLine();
		age= sc.nextInt();
		sc.nextLine();
		city= sc.nextLine();
		
		p1= new Person(name,age,city);//parameterized
		System.out.println("person details Name:" +p1.getPersonName() + "\t Age:"+p1.getPersonAge() +"\tCity:"+p1.getPersonCity());
         sc.close();
	}

}
