package com.pro.springdemoiocnoxml;

import org.springframework.stereotype.Component;

@Component
public class TcorpFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		return "Your day is very lucky bindu!";
	}

}
