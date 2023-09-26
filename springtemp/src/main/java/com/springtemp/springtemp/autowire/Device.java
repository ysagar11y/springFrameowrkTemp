package com.springtemp.springtemp.autowire;

public class Device {
	
	private String type;
	private String brand;
	private double price;
	private int quatity;
	private Address add;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
	@Override
	public String toString() {
		return "Device [type=" + type + ", brand=" + brand + ", price=" + price + ", quatity=" + quatity + ", add="
				+ add + "]";
	}
	
	
	

}
