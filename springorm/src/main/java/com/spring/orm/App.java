package com.spring.orm;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
       
        App a = new App();
        a.mainMenu();
     }
    
    ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
    
    Scanner ob = new Scanner(System.in);
    String choice = "";
  
    
	private void mainMenu() {
		
		System.out.println(" \n #### WELCOME TO ORM MANAGMENT SYSTEM #### \n");
		System.out.println(" #*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
		System.out.println(" *                                   #");
		System.out.println(" #     1-ADD NEW STUDENT             *");
		System.out.println(" *     2-GET ALL STUDENTS            #");
		System.out.println(" #     3-GET A SINGLE STUDENT OBJECT *");
		System.out.println(" *     4-DELETE STUDENT              #");
		System.out.println(" #     5-UPDATE STUDENT              *");
		System.out.println(" *     6-EXIT                        #");
		System.out.println(" #                                   *");
		System.out.println(" #*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#\n");
		System.out.print("ENTER OPERATION NO: ");
		choice = ob.next();
		
		switch (choice) {
		case "1":
			addStudent();
			mainMenu();
			break;
		case "2":
			viewAllStudent();
			mainMenu();
			break;
        case "3":
			viewSingleStudent();
			mainMenu();
			break;
        case "4":
			deleteStudent();
			mainMenu();
			break;	
        case "5":
			updateStudent();
			mainMenu();
			break;
        case "6":
			//System.exit(0);
			System.out.println("\nTHANK YOU FOR USING MY APPLICATION");
			System.out.println("SEE YOU SOON !!");
			break;	
		default:
			System.out.println("\nYOU HAVE ENTER WRONG OPERATION PLEASE RE-ENTER OPERATION\n");
			mainMenu();
			break;
		}
		
	}
	
	private void addStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("     \n### ADD STUDENT DETAIL ###\n");
		System.out.println("ENTER STUDENT ID :");
		int sId = sc.nextInt();
		
		System.out.println("ENTER STUDENT NAME :");
		String sName = sc.next();
		
		System.out.println("ENTER STUDENT CITY :");
		String sCity = sc.next();
		
		Student s = new Student();
		s.setStudentId(sId);
		s.setStudentName(sName);
		s.setStudentCity(sCity);
		
		int row = studentDao.insert(s);
		if (row > 0) {
			System.out.println("RECORD ADDED SUCCESSFULLY...");
			
		} else {
			System.out.println("SORRY RECORD NOT ADDED...");
		}
		
		
		
	}
	
	private void viewAllStudent() {
	List<Student> allStudents = studentDao.getAllStudents();	
	System.out.println("\n### LIST OF STUDENTS ###\n");
	System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
	System.out.println("*      ID      |	   Name       |       CITY     #");
	System.out.println("----------------------------------------------------");
	for(Student student : allStudents) {
		System.out.println("#   "+" "+student.getStudentId()+"             "+student.getStudentName()+"       "+student.getStudentCity()+"  "+"    ");
		
	}
	System.out.println("#                                                  *");
	System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
	
	}
	
	private void viewSingleStudent() {
		System.out.println("\n### SINGLE STUDENT DETAIL ###\n");
		
		System.out.println("ENTER STUDENT ID :");
		int studentId = ob.nextInt();
		Student st = studentDao.getStudent(studentId);

		System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*");
		System.out.println("*      ID      |	 Name     |     CITY        #");
		System.out.println("----------------------------------------------------");
		System.out.println("#  "+"  "+st.getStudentId()+"           "+st.getStudentName()+"          "+st.getStudentCity()+""+"     *");
		System.out.println("*                                                   #");
		System.out.println("#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#");
	}
	
	private void deleteStudent() {
		System.out.println("\n### DELETE STUDENT ###\n");
		System.out.println("ENTER STUDENT ID :");
		int sid = ob.nextInt();
	    studentDao.deleteStudent(sid);
	    System.out.println("\nSTUDENT DELETE SUCCESSFULLY");
		
	}
	
	private void updateStudent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n### UPDATE STUDENT ###\n");
		
		System.out.println("ENTER STUDENT ID :");
		int sid = sc.nextInt();
		
		System.out.println("ENTER STUDENT NAME :");
		String sName = sc.next();
		
		System.out.println("ENTER STUDENT CITY :");
		String sCity = sc.next();
		
		Student st = new Student();
		st.setStudentId(sid);
		st.setStudentName(sName);
		st.setStudentCity(sCity);
		
		studentDao.updateStudent(st);
		System.out.println("RECORD UPDATED SUCCESSFULLY\n");
		
	}
}
