package com.seleniumexpress.lifecycle.annotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean,DisposableBean {

/*	public void init() {
		
		System.out.println("Inside the init method of hello class");
	}
	
	public void destroy() {
		
		System.out.println("Inside the destroy method of hello class");
	} */

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Sabjay");
		System.out.println("Inside after property set method --> init");	
	}
	
	
	public void sample() {
		
		System.out.println("my coding starts from here and ends here");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method --> destroy");
		
	}
}
