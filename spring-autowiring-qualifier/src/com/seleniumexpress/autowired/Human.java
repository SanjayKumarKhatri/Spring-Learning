package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
    @Qualifier("heartOcupts")
	private Heart heart;
	
   /* public Human() {
		
	} */
	
/*	@Autowired
	public Human(Heart heart) {
		super();
		this.heart = heart;
		System.out.println("Constr called");
	} */

   
/*	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter method called....");
	} */
	
	public void startPumping() {
		
		if(heart != null) {
			
			heart.pump();
			System.out.println("Name of the animal is :" +heart.getNameOfAnimal());
			System.out.println("No of heart is : " +heart.getNoOfHeart());
	   }
		else {
			System.out.println("you are dead...");
		}
	}

}
