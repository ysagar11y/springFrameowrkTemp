package com.springtemp.springtemp.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int roll;
	private String name;
	private double marks;
	@Autowired
	private Address add;
	
	
	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	public Address getAdd() {
		return add;
	}


	public void setAdd(Address add) {
		this.add = add;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", add=" + add + "]";
	}

}
