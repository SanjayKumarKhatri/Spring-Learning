package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.style.StylerUtils;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {

	public static void main(String[] args) {
		
		System.out.println("My Program is started....");
		
		ApplicationContext context  = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		
		//Insert data...
	/*	Student student = new Student();
		student.setId(4);
		student.setName("Aman Kumar");
		student.setCity("Umerkot");
		
		int result = studentDao.insert(student);
		System.out.println("Student add : "+result);*/
		
		//update data...
		/*Student student = new Student();
		student.setId(4);
		student.setName("Manoj Kumar");
		student.setCity("Jamshoro");
		
		int result = studentDao.update(student);
		System.out.println("Data is update : "+result);*/
		
		//delete data...
	/*  int result = studentDao.delete(4);
		System.out.println("data delete : "+result); */
		
	/*	Student student = studentDao.getStudent(1);
		System.out.println(student); */
		
		List<Student> students = studentDao.getAllStudents();
		for(Student s : students) {
			System.out.println(s); 
		}
		
		
		
		
		
	}

}
