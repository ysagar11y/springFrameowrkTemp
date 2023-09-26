package com.springtemp.springtemp.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext(
				"com/springtemp/springtemp/collection/collec_config.xml");

		Student stu = (Student) con.getBean("stu1");

		System.out.println(stu);
	}

}
