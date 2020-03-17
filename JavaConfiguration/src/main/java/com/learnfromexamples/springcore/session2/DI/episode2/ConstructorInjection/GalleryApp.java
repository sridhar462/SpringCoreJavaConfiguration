package com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection;

public class GalleryApp {
	private IShare share;

	public GalleryApp(IShare share) {
		this.share = share;
	}
	
	public IShare getShare() {
		return share;
	}

	
}
