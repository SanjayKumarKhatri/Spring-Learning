package com.seleniumexpress;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("Cpnfig file loaded...");
		Student std = context.getBean("student", Student.class);
		std.showStudentInfo();
	}

}
 