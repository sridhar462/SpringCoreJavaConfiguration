package com.learnfromexamples.springcore.JavaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnfromexamples.springcore.configuration.AppConfig5SetterInjection;
import com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection.GalleryAppSetterInjection;
import com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection.GmailSetterInjection;
import com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection.IShareSetterInjection;

public class App3SetterInjection {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig5SetterInjection.class);

		GalleryAppSetterInjection app = context.getBean(GalleryAppSetterInjection.class);
		
		app.getShare().send();
		
		/*GalleryApp app1 = (GalleryApp)context.getBean("app"); // app is specified in @Bean(name="app") 
		
		app1.getShare().send();*/
		
		IShareSetterInjection share = (IShareSetterInjection)context.getBean(GmailSetterInjection.class);
		share.send();
	}
}
