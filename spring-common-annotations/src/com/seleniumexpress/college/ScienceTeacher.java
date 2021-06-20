package com.seleniumexpress.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hi I am your Science Teacher");
		System.out.println("My Name is Sanjay Kumar");
	}

}
