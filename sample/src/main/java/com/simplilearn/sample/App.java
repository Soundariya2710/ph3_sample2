package com.simplilearn.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.simplilearn.spring.Employee;
import com.simplilearn.spring.Question;
import com.simplilearn.spring.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      // Resource resource =new  ClassPathResource("ApplicationContext.xml");
       
       //BeanFactory factory = new XmlBeanFactory(resource);
       
      // Student student = (Student) factory.getBean("studentbean");
    	
    	
    	//ApplicationContext 
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
    	Student student = (Student) context.getBean("studentbean");
    	
    	Employee emp =  (Employee) context.getBean("employeebean");
    	
    	Question qn = (Question) context.getBean("questionbean");
       
       student.Display();
       
       emp.Empinfo();
       
       qn.display();
       
    }
}
