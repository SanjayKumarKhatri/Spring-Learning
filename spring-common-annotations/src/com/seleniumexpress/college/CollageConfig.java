package com.seleniumexpress.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.seleniumexpress.college")
@PropertySource("classpath:collage-info.properties")
public class CollageConfig {
	
/*	@Bean
	public Teacher mathTeacherBean() {
		
		return new MathTeacher();
	}
	
	
	@Bean
	public Principal principalBean() {
		
		return new Principal();
	}
	
	@Bean // (name = {"colBean","collageBeanObject"})
	public Collage collageBean()  //collageBean-bean-id
	{
		
		Collage collage = new Collage();
		collage.setPrincipal(principalBean());
		collage.setTeacher(mathTeacherBean());	
		return collage;
	} */

}
