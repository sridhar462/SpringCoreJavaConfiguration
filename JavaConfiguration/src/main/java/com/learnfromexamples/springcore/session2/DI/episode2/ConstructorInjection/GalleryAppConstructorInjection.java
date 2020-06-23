package com.learnfromexamples.springcore.session2.DI.episode2.ConstructorInjection;

public class GalleryAppConstructorInjection {
	private IShareConstructorInjection share;

	public GalleryAppConstructorInjection(IShareConstructorInjection share) {
		this.share = share;
	}
	
	public IShareConstructorInjection getShare() {
		return share;
	}

	
}
