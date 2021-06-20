package com.seleniumexpress.lifecycle.annotations;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		context.registerShutdownHook();
		//StudentDao std =  context.getBean("studentDao", StudentDao.class);
		//System.out.println(std);
		//std.selectAllRows();
		
		Hello hello =  context.getBean("hello", Hello.class);
		hello.sample();
		
		//context.close();
		
		
		
	}

}
