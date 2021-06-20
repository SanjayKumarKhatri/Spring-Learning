package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collageBean")
public class Collage {
	
	private String collageName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("mathTeacher")
	private Teacher teacher;
	

	/*
	  public Collage(Principal principal) { 
	  this.principal = principal; 
	  }
	 */
	
	
/*	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("setPrincipal method called");
	}

	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	} */
	
	@Required
	@Value("${Collage.collageName}")
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	
	public void test() {
		
		principal.principalInfo();
		teacher.teach();
		System.out.println("My Collage Name Is : " + collageName);
		System.out.println("This is method");
	}



}
