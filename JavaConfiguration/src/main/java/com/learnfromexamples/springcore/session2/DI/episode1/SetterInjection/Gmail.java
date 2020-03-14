package com.learnfromexamples.springcore.session2.DI.episode1.SetterInjection;

public class Gmail implements IShare {

	@Override
	public void send() {
		System.out.println("Hello Gmail !!!");
	}

}
