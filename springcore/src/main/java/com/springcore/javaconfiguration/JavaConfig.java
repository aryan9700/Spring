package com.springcore.javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	@Bean(name = {"student", "temp", "con"})
	public Student getStudent() {
		//Creating a new student object
		Student student=new Student(getSamosa());
		return student;
		
	}
	
}
