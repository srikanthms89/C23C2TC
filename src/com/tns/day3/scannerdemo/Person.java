package com.tns.day3.scannerdemo;

public class Person {
	//Data members
	private int income;
	private String gender;
	private int age;
	private int tax;
	private String name;
	
	//Getters and setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	//object class method to return string representation pf person object
	@Override
	public String toString() {
		return "Person [income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax + ", name=" + name
				+ "]";
	}
	
	

}
