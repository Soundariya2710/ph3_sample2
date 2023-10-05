package com.simplilearn.springautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.springautowiring.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 

{
	public static void main (String args[]) {
		
	
    ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    
    Employee employee = (Employee) applicationcontext.getBean("employeebean");
    
    employee.display();
    
    
	} 
    
    
}
