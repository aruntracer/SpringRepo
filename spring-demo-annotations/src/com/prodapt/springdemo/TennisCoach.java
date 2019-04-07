package com.prodapt.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("tcorpFortuneService")
	private FortuneService fortuneService;
	
	//get value from properties file
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String team;
	
	//default constructor	
	public TennisCoach() {
		System.out.println("inside def cons");
	}
	// constructor injection
//	  @Autowired 
//	  public TennisCoach(@Qualifier("tcorpFortuneService")FortuneService fortuneService) {
//	  this.fortuneService = fortuneService; 
//	  }
	 
	//setter method
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("inside setter");
//		this.fortuneService = fortuneService;
//	}
	
	/*
	 * @Autowired public void doSomeStuff(FortuneService fortuneService) {
	 * System.out.println("inside setter"); this.fortuneService = fortuneService; }
	 */

	@Override
	public String getDailyWorkout() {		
		return "Practice half volley shots today";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
}
