package com.learnfromexamples.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnfromexamples.springcore.modal.Company;

@Configuration
public class AppConfig2 {

	@Bean(name="company")
	public Company getCompany() {
		Company comp = new Company();
		comp.setCompanyName("Hexaware");
		return comp;
	}
}
