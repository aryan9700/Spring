package com.springcore.javaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
	Student fstudent=context.getBean("temp",Student.class);
	System.out.println(fstudent);
fstudent.study();
}
}
