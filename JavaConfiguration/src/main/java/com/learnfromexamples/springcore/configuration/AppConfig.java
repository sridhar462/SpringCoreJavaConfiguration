package com.learnfromexamples.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnfromexamples.springcore.modal.Employee;

@Configuration
public class AppConfig {

	@Bean(name="sridhar")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setEmpName("Sridhar - Spring Core - Java Config");
		return emp;
	}
}
