package com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection;

public class GalleryApp {
	private IShare share;

	public IShare getShare() {
		return share;
	}

	public void setShare(IShare share) {
		this.share = share;
	}
	
}
