package com.seleniumexpress.college;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollageConfig.class);
		Collage collage =  context.getBean("collageBean",Collage.class);
		System.out.println("The Collage Object create by spring is : " + collage);
		collage.test();
		context.close();

	}

}
