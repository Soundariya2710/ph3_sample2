package com.simplilearn.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.spring.jdbc.bean.Employee;
import com.simplilearn.spring.jdbc.dao.Employeedao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Employeedao emp = (Employeedao) context.getBean("employeedao");
        
        int status = emp.saveEmployee(new Employee(110, "Soundariya", "admin", "soundariya@gmail.com", "India"));
        
        if(status>0) {
        	System.out.println("Operation successful");
        	
        }
    }
}
