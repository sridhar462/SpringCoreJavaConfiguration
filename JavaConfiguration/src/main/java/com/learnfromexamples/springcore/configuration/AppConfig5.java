package com.learnfromexamples.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection.GalleryApp;
import com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection.Gmail;
import com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection.IShare;
import com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection.WatsApp;

@Configuration
public class AppConfig5 {
	
	@Bean(name="app")
	public GalleryApp getGalleryApp() {
		GalleryApp app = new GalleryApp();
		app.setShare(getEmail());
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
