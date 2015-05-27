package com.ermolaev.annotation;

public class Account {
	private Float balance = 0.0f;
	private Person person = null;
	private Address address = null;
	
	public Account(Float balance)
	{
		this.balance = balance;
	}
	
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void print()
	{
		if(person != null)
			person.print();
		
		if(address != null)
			address.print();
		
		System.out.println(String.format("Balance: %.2f", balance));
	}
}
