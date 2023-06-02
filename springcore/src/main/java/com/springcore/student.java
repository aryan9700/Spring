package com.springcore;

public class student {
private int studentId;
private String studentName;
private String studentAddress;
public student() {
	
	super();
	// TODO Auto-generated constructor stub
}
public student(int studentId, String studentName, String studentAddress) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAddress = studentAddress;
}

public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	System.out.println("setting student id");
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	System.out.println("setting student  name");
	this.studentName = studentName;
}
public String getStudentAddress() {
	return studentAddress;
}
public void setStudentAddress(String studentAddress) {
	System.out.println("setting student address");
	this.studentAddress = studentAddress;
}
@Override
public String toString() {
	return "student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
			+ "]";
}

}
