package com.learnfromexamples.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.GalleryApp;
import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.Gmail;
import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.IShare;
import com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection.WatsApp;

@Configuration
public class AppConfig6 {
	
	@Bean(name="app")
	public GalleryApp getGalleryApp() {
		GalleryApp app = new GalleryApp(getEmail());
		return app;
	}
	
	
	@Bean(name="gmail")
	public IShare getEmail() {
		IShare share = new Gmail();
		return share;
	}
	
	@Bean
	public IShare getWatsApp() {
		IShare share = new WatsApp();
		return share;
	}
}
