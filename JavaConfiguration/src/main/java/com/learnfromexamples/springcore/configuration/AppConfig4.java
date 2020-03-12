package com.learnfromexamples.springcore.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {AppConfig2.class,AppConfig3.class})
public class AppConfig4 {

	
}
