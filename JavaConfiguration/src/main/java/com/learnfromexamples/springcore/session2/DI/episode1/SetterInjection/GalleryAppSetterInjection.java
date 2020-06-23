package com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection;

public class GalleryAppSetterInjection {
	private IShareSetterInjection share;

	public IShareSetterInjection getShare() {
		return share;
	}

	public void setShare(IShareSetterInjection share) {
		this.share = share;
	}
	
}
