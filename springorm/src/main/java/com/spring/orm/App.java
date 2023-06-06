package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentdao", StudentDao.class);

//       Student student=new Student(876,"Aryan","punjab");
//       int r = studentDao.insert(student);
//       System.out.println("Data Inserted........"+r);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
		while(go) {
			System.out.println("Press 1 for add new student");
		System.out.println("Press 2 for display all students");
		System.out.println("Press 3 for get details of single student");
		System.out.println("Press 4 for delete students");
		System.out.println("Press 5 for update students");
		System.out.println("Press 6 for exit");
		try {
			int input = Integer.parseInt(br.readLine());
			/*
			 * if(input==1) { //add a new student }else if(input==2) { //display }
			 */
			switch (input) {
			case 1:
				//Adding a new student
				//Taking Input from users
				System.out.println("Enter user Id: ");
				int uId=Integer.parseInt(br.readLine());
				System.out.println("Enter user Name: ");
				String uName=br.readLine();
				System.out.println("Enter user City: ");
				String uCity=br.readLine();
				
				//Creating student object and setting values
				Student s=new Student();
				s.setStudentId(uId);
				s.setStudentName(uName);
				s.setStudentCity(uCity);
				
				//Saving student object to database by calling insert of student dao
				int r = studentDao.insert(s);
				System.out.println(r+"n Student added.");
				System.out.println("****************************************************************");
				System.out.println();
				break;
			case 2://display all students
				System.out.println("****************************************************************");
				List <Student> allstudents=studentDao.getAllStudent();
				for (Student st : allstudents) {
					System.out.println("Id: "+ st.getStudentId());
					System.out.println("Name: "+ st.getStudentName());
					System.out.println("City: "+ st.getStudentCity());
					System.out.println("__________________________________________________________________");
				}
				System.out.println("****************************************************************");
				break;
			case 3:
				//get single student data
				System.out.println("Enter user Id: ");
				int userId=Integer.parseInt(br.readLine());
				Student student = studentDao.getStudent(userId);
				System.out.println("Id: "+ student.getStudentId());
				System.out.println("Name: "+ student.getStudentName());
				System.out.println("City: "+ student.getStudentCity());
				System.out.println("__________________________________________________________________");
				break;
			case 4:
				//delete student
				System.out.println("Enter user Id: ");
				int id=Integer.parseInt(br.readLine());
				studentDao.deleteStudent(id);
				System.out.println("Student deleted.........");
				break;
			case 5:
				//update method

				break;
			case 6:

				go=false;
				break;
			}
		} catch (Exception e) {
			System.out.println("Invalid input try with another one!!");
			System.out.println(e.getMessage());
		}
	}
		System.out.println("Thankyou for using my application");
		System.out.println("See You Soon!!");
		}
	}
