package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/stereotype/Stereo.xml");
	
	Student student=context.getBean("student",Student.class);//replace student with obj
//    System.out.println(student);
//    System.out.println(student.getAddress());
//    System.out.println(student.getAddress().getClass().getName());
	 System.out.println(student.hashCode());
	 Student student1=context.getBean("student",Student.class);
	 System.out.println(student1.hashCode());
	 
	 Teacher t1=context.getBean("teach", Teacher.class);
	 Teacher t2=context.getBean("teach", Teacher.class);
	
	 System.out.println(t1.hashCode());
	 System.out.println(t2.hashCode());
	 
}
}