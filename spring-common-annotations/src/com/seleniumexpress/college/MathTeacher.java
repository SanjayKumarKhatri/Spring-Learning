package com.seleniumexpress.college;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi I am your math teacher...");
		System.out.println("My Name is Akash Kumar");
	}

}
