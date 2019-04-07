package com.pro.springdemoiocnoxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class); 
		
		SwimCoach thecoach = context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getDailyFortune());
		System.out.println(thecoach.getEmail());
		System.out.println(thecoach.getTeam());
		
		context.close();
		
	}

}
