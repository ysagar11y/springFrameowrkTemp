package com.springtemp.springtemp.cnstxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springtemp/springtemp/cnstxml/cnst_config.xml");
		
		Student student1 = (Student) con.getBean("student1");
		Student student2 = (Student) con.getBean("student2");
		System.out.println(student1);
		System.out.println(student2);
	}

}
