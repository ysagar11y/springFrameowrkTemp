package com.springtemp.springtemp.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springtemp/springtemp/annotation/annot_config.xml");
		
		Student student = (Student) con.getBean("student");
		
		System.out.println(student);
		
	}

}
