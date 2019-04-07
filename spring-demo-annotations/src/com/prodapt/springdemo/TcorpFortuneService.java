package com.prodapt.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TcorpFortuneService implements FortuneService {

	@Override 
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Tcorp: Your a very luck person sir!";
	}

}
