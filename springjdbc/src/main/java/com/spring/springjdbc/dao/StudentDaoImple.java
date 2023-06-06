package com.spring.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.springjdbc.entities.Student;
@Component("std")
public class StudentDaoImple implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public int insert(Student student) {
		 //insert query
	       String query="insert into student(id,name,city) values(?,?,?)";
	       int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}

	public int change(Student student) {
		// updating data
		String query="update student set name=?,city=? where id=?";
		int u = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return u;
	}

	public int delete(int studentId) {
		// delete data
				String query="delete from student where id=?";
				int d = this.jdbcTemplate.update(query,studentId);
				return d;
	}
	public Student getStudent(int studentId) {
		// Selecting single student data
		String query = "select * from student where id=?";
															// RowMapper<Student> rowMapper=new RowMapperImple();
															 
		Student student = this.jdbcTemplate.queryForObject(query,new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student=new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));
				return student;
			}
			
		},studentId);
		return student;
	}

	public List<Student> getAllStudent() {
		//Selecting Multiple student
		String query = "select * from student";
		List<Student> student = this.jdbcTemplate.query(query,new RowMapperImple());
		return student;
		
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


}
