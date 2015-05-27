package com.ermolaev.annotation;

public class Address {
	
	private String country;
	private String city;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void print()
	{
		System.out.println("Address: " + city + ", " + country);
	}
}
