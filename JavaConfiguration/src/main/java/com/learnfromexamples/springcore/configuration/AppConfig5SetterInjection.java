package com.learnfromexamples.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection.GalleryAppSetterInjection;
import com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection.GmailSetterInjection;
import com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection.IShareSetterInjection;
import com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection.WatsAppSetterInjection;

@Configuration
public class AppConfig5SetterInjection {
	
	@Bean
	public GalleryAppSetterInjection getGalleryApp() {
		GalleryAppSetterInjection app = new GalleryAppSetterInjection();
		app.setShare(getWatsApp());
		return app;
	}
	
	
	@Bean
	public IShareSetterInjection getEmail() {
		IShareSetterInjection share = new GmailSetterInjection();
		return share;
	}
	
	@Bean
	public IShareSetterInjection getWatsApp() {
		IShareSetterInjection share = new WatsAppSetterInjection();
		return share;
	}
}
