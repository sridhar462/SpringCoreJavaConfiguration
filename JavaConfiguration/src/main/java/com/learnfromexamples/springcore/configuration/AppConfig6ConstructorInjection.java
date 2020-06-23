package com.learnfromexamples.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.GalleryAppConstructorInjection;
import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.GmailConstructorInjection;
import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.IShareConstructorInjection;
import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.WatsAppConsructorInjection;

@Configuration
public class AppConfig6ConstructorInjection {
	
	@Bean(name="app")
	public GalleryAppConstructorInjection getGalleryApp() {
		GalleryAppConstructorInjection app = new GalleryAppConstructorInjection(getEmail());
		return app;
	}
	
	
	@Bean(name="gmail")
	public IShareConstructorInjection getEmail() {
		IShareConstructorInjection share = new GmailConstructorInjection();
		return share;
	}
	
	@Bean
	public IShareConstructorInjection getWatsApp() {
		IShareConstructorInjection share = new WatsAppConsructorInjection();
		return share;
	}
}
