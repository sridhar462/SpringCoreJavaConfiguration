package com.learnfromexamples.springcore.JavaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnfromexamples.springcore.configuration.AppConfig4;
import com.learnfromexamples.springcore.modal.Company;
import com.learnfromexamples.springcore.modal.Department;

public class App2 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig4.class);

		Company com = context.getBean(Company.class);
		
		System.out.println(com.getCompanyName());
		
		Department dept = context.getBean(Department.class);
		
		System.out.println(dept.getDeptName());
	}
}
