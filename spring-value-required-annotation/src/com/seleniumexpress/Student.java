package com.seleniumexpress;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.course}")
	private String course;
	
	@Value("${student.hobby}")
	private String hobby;
	
	
	public void showStudentInfo() {
		
		System.out.println("Student Name is : " + name);
		System.out.println("Student Course is : " + course);
		System.out.println("Student Hobby is : " + hobby);
	}
	
	

}
