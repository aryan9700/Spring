package com.spring.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.springjdbc.dao.StudentDao;
import com.spring.springjdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started........." );
        // spring jdbc=> JdbcTemplate
//        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/springjdbc/config.xml");
     ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = context.getBean("std",StudentDao.class);
        
        List<Student> student=studentDao.getAllStudent(); 
        for (Student s : student) {
        System.out.println(s);
        }
        
        
		/*GET SINGLE ROW
		 * Student student=studentDao.getStudent(456); System.out.println(student);
		 */
        
		/*DELETE ROW
		 * int result = studentDao.delete(23);
		 * System.out.println("Deleted......."+result);
		 */
        
		/*CHANGE VALUE
		 * Student student=new Student(); student.setId(123); student.setName("Mohit");
		 * student.setCity("Pune"); int result = studentDao.change(student);
		 * System.out.println("Data changed"+result);
		 */
        
        
        
		/*
		 * 
		 * Student student1=new Student(); student1.setId(123);
		 * student1.setName("people"); student1.setCity("Jamica"); int result=
		 * studentDao.insert(student1); System.out.println("Student added..."+result);
		 */
		 
        
        
        
		/*
		 * JdbcTemplate template= context.getBean("jdbcTemp",JdbcTemplate.class);
		 * //insert query String
		 * query="insert into student(id,name,city) values(?,?,?)"; //fire query
		 * //ctrl+1 int result = template.update(query,456,"Hawk","Bhilai");
		 * System.out.println("Number of record insert......"+ result);
		 */
    }
}
