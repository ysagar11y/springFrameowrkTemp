package com.springtemp.springtemp.standlone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springtemp/springtemp/standlone/standalone_config.xml");
		
		Student student = (Student) con.getBean("student");
		
		System.out.println(student);
		
	}

}