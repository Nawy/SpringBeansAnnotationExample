package com.ermolaev.annotation;

public class Person {

	public enum Sex { MALE, FEMALE }
	
	private String firstName;
	private String lastName;
	private Sex sex;
	
	public Person(Sex sex)
	{
		this.sex = sex;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Sex getSex() {
		return sex;
	}
	
	public void init()
	{
		System.out.println("Person: init()");
	}
	
	public void destroy()
	{
		System.out.println("\nPerson: destroy(" + firstName + " " + lastName + ")");
	}
	
	public void print()
	{
		String sexString = "";
		if(this.sex == Sex.MALE)
			sexString = "Man";
		else
			sexString = "Woman";
		
		System.out.println(firstName + " " + lastName + " (" + sexString + ")");
	}
}
