package com.prodapt.springdemoioc;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	int rand;
	String[] fortunelist = new String[3];
	
	@Override
	public String getFortune() {		
		Random random = new Random();
		rand = random.nextInt(3);
		System.out.println("rand "+rand);
		fortunelist[0] = "Today is your luck day!";
		fortunelist[1] = "Today is your okok day!";
		fortunelist[2] = "Today is your worst day!";
		System.out.println("In HFS");
		return fortunelist[rand];
	}

}
