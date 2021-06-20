package com.seleniumexpress.di;

public class Student {
	
	private int id;
	private String studentName;

	
	  public Student(int id) {
		  
		  this.id = id;
	 
	  }
	  
	  public Student(int id, String studentName) { 
		  this.id = id; 
		  this.studentName = studentName;
	}
	 


	/* public void setStudentName(String studentName) {
		this.studentName = studentName;
		
		System.out.println("Setter method called : "+ ":Name");
	}
	
	
	public void setId(int id) {
		this.id = id;
		System.out.println("Setter method called : "+ ":Id");
	}*/



	public void getStudentInfo() {
		
		System.out.println("Student Name is : "+studentName);
		System.out.println("Student Id is : "+id);
	}
	
}
