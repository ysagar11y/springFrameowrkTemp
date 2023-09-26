package com.springtemp.springtemp.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Address {

	private String street;
	private String city;
	private int pin;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}

	@PostConstruct
	public void hi() {
		System.out.println("hii annotation");
	}

	@PreDestroy
	public void bye() {
		System.out.println("bye annotation");
	}

}
