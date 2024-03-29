package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
			
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml"); 
		
		// retrieve bean from spring container
		
		Coach theCoach= context.getBean("myCoach",Coach.class);
		Coach alphaCoach= context.getBean("myCoach",Coach.class);
		
		//check if they are same
		boolean result = (theCoach == alphaCoach);
	
		//printout the results
		System.out.println("\n Pointing to same object"+result);
		System.out.println("\n thecoach"+theCoach);
		System.out.println("\n thealphacoach"+alphaCoach+"\n");
		
		//close the context
		context.close();
	
	}

}
