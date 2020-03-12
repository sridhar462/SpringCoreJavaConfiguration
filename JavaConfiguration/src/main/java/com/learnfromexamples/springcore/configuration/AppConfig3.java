package com.learnfromexamples.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnfromexamples.springcore.modal.Department;

@Configuration
public class AppConfig3 {

	@Bean(name="department")
	public Department getDepartment() {
		Department dept = new Department();
		dept.setDeptName("IT");
		return dept;
	}
}
