package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Entity;

@Entity
@javax.persistence.Entity
@Table(name = "student_details")
public class Student {
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	@Id
	@Column(name="student_id")
	private int studentId;
	@Column(name="student_name")
	private String studentName;
	@Column(name="student_city")
	private String studentCity;
	
}
