package com.prodapt.springdemoioc;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coach BaseCoach = new BaseballCoach(null);
		System.out.println("Asking BaseballCoach");
		System.out.println(BaseCoach.getDailyWorkout());
	}

}
