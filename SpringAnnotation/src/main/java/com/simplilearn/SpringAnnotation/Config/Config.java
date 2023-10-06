package com.simplilearn.SpringAnnotation.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simplilearn.SpringAnnotation.bean.Department;
import com.simplilearn.SpringAnnotation.bean.Employee;

@Configuration
public class Config {
	
	@Bean(name="employee")
	public Employee emp() {
		
		return new Employee();
		
	}
	
	@Bean(name="department")
	public Department department() {
		
		return new Department();
	}

}
