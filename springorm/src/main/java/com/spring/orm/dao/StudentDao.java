package com.spring.orm.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	//Save student
	@Transactional
	public int insert(Student student) {
		//insert
		Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}
	//get the single data oject
	public Student getStudent(int studentId) {
		Student student  = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	//get all student(get all rows)
		public List<Student> getAllStudent() {
			List<Student> students  = this.hibernateTemplate.loadAll(Student.class);
			return students;
		}
		//deleting data
		@Transactional
		public void deleteStudent(int studentId) {
			Student student  = this.hibernateTemplate.get(Student.class, studentId);
			this.hibernateTemplate.delete(student);
		}
		//updating data
		@Transactional
		public void updateStudent(Student student) {
			this.hibernateTemplate.update(student);
		}
		
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
