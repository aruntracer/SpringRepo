package com.prodapt.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TennisCoach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		context.close();

	}

}
