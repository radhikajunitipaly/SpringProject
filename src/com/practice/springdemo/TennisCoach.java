package com.practice.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Work out Tennis for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	@Override
	public String getEmail() {
		return null;
	}

	@Override
	public String getTeam() {
		return null;
	}

}
