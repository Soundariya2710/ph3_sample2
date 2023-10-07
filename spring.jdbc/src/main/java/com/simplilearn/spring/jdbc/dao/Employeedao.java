package com.simplilearn.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.simplilearn.spring.jdbc.bean.Employee;

public class Employeedao {
   
	private JdbcTemplate jdbctemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	//save Employee or Insert 
	public int saveEmployee(Employee e) {
		String query = "insert into emp1 values('" + e.getId() + "','" + e.getName() + "','" + e.getPassword()
				+ "', '" + e.getEmail() + "','" + e.getCountry() + "')";
		return jdbctemplate.update(query);
	}
	
	//Update query
	public int updateEmployee(Employee e) {
		String query = "update emp1 set name='" + e.getName() + "', password='" + e.getPassword() + "', email='"
				+ e.getEmail() + "', country='" + e.getCountry() + "' where id = '" + e.getId() + "'";

		return jdbctemplate.update(query);
	}
   
	//delete query
	public int deleteEmployee(int id) {
		String query = "delete from emp1 where id = '" + id + "'";
		return jdbctemplate.update(query);
	}
	
}
