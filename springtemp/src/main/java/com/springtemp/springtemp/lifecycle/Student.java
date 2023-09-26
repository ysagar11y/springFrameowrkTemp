package com.springtemp.springtemp.lifecycle;

public class Student {

	private String name;
	private int roll;
	private double marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void hi() {
		System.out.println("Hii XML config");
	}

	public void bye() {
		System.out.println("Byee XML config");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}

}
