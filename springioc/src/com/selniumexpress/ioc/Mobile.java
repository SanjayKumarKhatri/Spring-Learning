package com.selniumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

		public static void main(String[] args) {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
			System.out.println("Config Build...");
			
			/*
			 * Airtel air = (Airtel) context.getBean("airtel"); 
			 * air.calling(); 
			 * air.data();
			 */
			
		    
			/*
			 * Vodaphone voda = context.getBean("vodaphone", Vodaphone.class);
			 * voda.calling();
			 * voda.data();
			 */
			
		     Sim sim = context.getBean("sim", Sim.class);
		     sim.calling();
		     sim.data();
		}
}