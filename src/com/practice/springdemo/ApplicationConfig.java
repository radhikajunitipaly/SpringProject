package com.practice.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.practice.springdemo")
@PropertySource("classpath:application.properties")
public class ApplicationConfig {
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(goodFortuneService());
	}
	
	@Bean
	public FortuneService goodFortuneService() {
		return new GoodFortuneService();
	}	
}
