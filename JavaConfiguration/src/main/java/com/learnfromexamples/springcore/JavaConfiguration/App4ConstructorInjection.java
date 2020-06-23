package com.learnfromexamples.springcore.JavaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnfromexamples.springcore.configuration.AppConfig6ConstructorInjection;
import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.GalleryAppConstructorInjection;
import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.IShareConstructorInjection;

public class App4ConstructorInjection {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig6ConstructorInjection.class);

		GalleryAppConstructorInjection app = context.getBean(GalleryAppConstructorInjection.class);
		
		app.getShare().send();
		
		GalleryAppConstructorInjection app1 = (GalleryAppConstructorInjection)context.getBean("app"); // app is specified in @Bean(name="app") 
		
		app1.getShare().send();
		
		IShareConstructorInjection share = (IShareConstructorInjection)context.getBean("gmail");
		share.send();
	}
}
