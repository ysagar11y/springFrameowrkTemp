package com.springtemp.springtemp.cnstxml;

public class Student {
	private int roll;
	private String name;
	private double marks;
	private Address add;
	
	public Student(int roll, String name, double marks, Address add) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", add=" + add + "]";
	}
	
}
