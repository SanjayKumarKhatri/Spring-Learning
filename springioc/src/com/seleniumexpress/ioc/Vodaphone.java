package com.seleniumexpress.ioc;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using vodaphone sim");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet using vodaphone sim");
		
	}
	

}
