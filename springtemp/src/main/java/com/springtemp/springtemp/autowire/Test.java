package com.springtemp.springtemp.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springtemp/springtemp/autowire/auto_config.xml");
		
		Device dev = (Device) con.getBean("dev");
		
		System.out.println(dev);
		
		Student student = (Student) con.getBean("student");
		
		System.out.println(student);

	}

}
