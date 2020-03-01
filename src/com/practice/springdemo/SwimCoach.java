package com.practice.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${swim.email}")
	private String email;
	@Value("${swim.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Autowired
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Play only swim today";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
