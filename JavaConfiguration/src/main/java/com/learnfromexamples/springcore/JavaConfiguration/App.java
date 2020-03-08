package com.learnfromexamples.springcore.JavaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnfromexamples.springcore.configuration.AppConfig;
import com.learnfromexamples.springcore.modal.Employee;

public class App {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp = context.getBean(Employee.class);

		System.out.println(emp);  
	}
}
