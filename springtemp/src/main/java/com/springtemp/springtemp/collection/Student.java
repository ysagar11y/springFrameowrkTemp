package com.springtemp.springtemp.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private String name;
	private Set<String> add;
	private List<String> phone;
	private Map<String, String> course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getAdd() {
		return add;
	}

	public void setAdd(Set<String> add) {
		this.add = add;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", add=" + add + ", phone=" + phone + ", course=" + course + "]";
	}

}
