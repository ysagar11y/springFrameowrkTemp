package com.springtemp.springtemp.autowire;

public class Address {
	
	private String street;
	private String city;
	private int pin;
	
	
	public Address(String street, String city, int pin) {
		super();
		this.street = street;
		this.city = city;
		this.pin = pin;
	}


	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}

}
