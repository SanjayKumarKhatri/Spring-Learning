package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//registering shutdown hook
		context.registerShutdownHook();
		
		/*Samosa samosa = (Samosa) context.getBean("s1");
		System.out.println(samosa);
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		Pepsi pepsi =(Pepsi) context.getBean("p1");
		System.out.println(pepsi);*/
		
		Example example = (Example) context.getBean("example");
		System.out.println(example);

	}

}
