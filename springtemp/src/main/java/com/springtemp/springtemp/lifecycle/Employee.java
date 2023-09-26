package com.springtemp.springtemp.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

	private String name;
	private double Salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Salary=" + Salary + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Hii spring interface");

	}

	public void destroy() throws Exception {
		System.out.println("byee spring interface");

	}

}
