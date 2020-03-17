package com.learnfromexamples.springcore.JavaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnfromexamples.springcore.configuration.AppConfig6;
import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.GalleryApp;
import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.IShare;

public class App4CI {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig6.class);

		GalleryApp app = context.getBean(GalleryApp.class);
		
		app.getShare().send();
		
		GalleryApp app1 = (GalleryApp)context.getBean("app"); // app is specified in @Bean(name="app") 
		
		app1.getShare().send();
		
		IShare share = (IShare)context.getBean("gmail");
		share.send();
	}
}
