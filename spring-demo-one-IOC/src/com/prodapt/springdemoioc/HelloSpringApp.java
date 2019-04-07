package com.prodapt.springdemoioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		try {
			// load the spring config file
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			// retrieve bean from the spring container
			Coach TrackCoach = context.getBean("myCoach",Coach.class);
			// call methods on the bean
			System.out.println(TrackCoach.getDailyWorkout());
			
			//let's call our new method for fortunes
			System.out.println(TrackCoach.getDailyFortune());
			
			context.close();

		} catch (Exception e) {
			System.out.println("Main Exception :"+e);
//            e.printStackTrace(); 

		}
	
		
	}

}
