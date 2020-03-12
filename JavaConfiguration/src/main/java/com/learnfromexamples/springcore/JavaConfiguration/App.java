package com.learnfromexamples.springcore.JavaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnfromexamples.springcore.configuration.AppConfig;
import com.learnfromexamples.springcore.modal.Employee;

public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		//Employee emp = context.getBean(Employee.class);
		
		Employee emp = (Employee) context.getBean("sridhar");
		
		// but 
		//Employee emp = (Employee) context.getBean("empName"); 
		// Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'empName' available
		

		System.out.println(emp);  
	}
}
