package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		
		Person person = (Person) context.getBean("person1");
		System.out.println(person);
		System.out.println(person.getFriend().getClass().getName());
		System.out.println("___________________________________________");
		System.out.println(person.getFeeStructure());
		System.out.println(person.getFeeStructure().getClass().getName());
		System.out.println("_____________________________________________");
		System.out.println(person.getProperties());
	}

}
