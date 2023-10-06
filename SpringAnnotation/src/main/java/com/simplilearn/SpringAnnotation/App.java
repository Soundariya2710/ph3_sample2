package com.simplilearn.SpringAnnotation;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.simplilearn.SpringAnnotation.Config.Config;
import com.simplilearn.SpringAnnotation.bean.Department;
import com.simplilearn.SpringAnnotation.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
         Employee employee = (Employee) applicationContext.getBean("employee");
         employee.setId(1);
         employee.setName("Sam");
         Department department = (Department) applicationContext.getBean("department");
         department.setId(1);
         department.setName("IT");
         employee.setDepartment(department);
         employee.displayEmployeeInfo();
    }
}
