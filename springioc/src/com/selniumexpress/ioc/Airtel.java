package com.selniumexpress.ioc;

public class Airtel implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling using airtel mobile");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internate using airtel sim");
		
	}

}
