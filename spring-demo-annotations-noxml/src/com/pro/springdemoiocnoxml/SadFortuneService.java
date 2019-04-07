package com.pro.springdemoiocnoxml;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		return "Today is a sad day";
	}

}
