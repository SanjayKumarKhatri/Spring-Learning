package com.seleniumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("config loaded");
	
	Sim simm = context.getBean("sim", Sim.class);
	simm.calling();
	simm.data();
	}

}
 