package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component("fstudent")
public class Student {
public void study() {
	System.out.println("student is reading book");
}
}
