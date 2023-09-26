package com.springtemp.springtemp.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext(
				"com/springtemp/springtemp/lifecycle/lifecycle_config.xml");

		Student stu = (Student) con.getBean("stu");

		Employee emp = (Employee) con.getBean("emp");

		Address add = (Address) con.getBean("add");

		System.out.println(stu);

		System.out.println(emp);

		System.out.println(add);

		((AbstractApplicationContext) con).registerShutdownHook();

	}

}
