package com.springtemp.springtemp.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new AnnotationConfigApplicationContext(Javaconfig.class);
		
		Student student = (Student) con.getBean("student");
		
		System.out.println(student.getName());
		System.out.println(student.getAdd());

	}

}
