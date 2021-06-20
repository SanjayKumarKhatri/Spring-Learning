package com.spring.orm.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	//inserting data 
	@Transactional
	public int insert(Student student) {
	   Integer i = (Integer)this.hibernateTemplate.save(student);
	   return i;
	}
	
	//get the single data(object)
	public Student getStudent(int studentId) {
		Student student =this.hibernateTemplate.get(Student.class, studentId);
		System.out.println(studentId);
		System.out.println(student);
		return student;
	}

	// get all students data(all rows)
	public List<Student> getAllStudents() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}

	//deleting the data
	@Transactional
	public void deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}

	//updating data
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);	
	}

	//getters and Setters of hibernateTemplate
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	

	
}
