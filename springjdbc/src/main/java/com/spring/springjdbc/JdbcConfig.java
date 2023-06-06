package com.spring.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.springjdbc.dao.StudentDao;
import com.spring.springjdbc.dao.StudentDaoImple;

@Configuration
@ComponentScan(basePackages = {"com.spring.springjdbc.dao"})
public class JdbcConfig {
	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("348846");
		
		return ds;
	}
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	/*instead autowired
	 * @Bean("std") public StudentDao getStudentDao() { StudentDaoImple studentDao =
	 * new StudentDaoImple(); studentDao.setJdbcTemplate(getTemplate()); return
	 * studentDao;
	 * 
	 * }
	 */

}
