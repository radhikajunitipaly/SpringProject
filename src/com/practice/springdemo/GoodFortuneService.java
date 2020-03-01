package com.practice.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GoodFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "It is a good fortune day";
	}

}
