package com.pro.springdemoiocnoxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("tcorpFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Pactice half volley for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

}
