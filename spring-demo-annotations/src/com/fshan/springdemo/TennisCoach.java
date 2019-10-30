package com.fshan.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor 
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default construction <<");
	}
	
	@PostConstruct
	public void doMyStuff() {
		System.out.println(">> TennisCoach: inside doMyStuff <<");
	}
	
	@PreDestroy
	public void cleanMyStuff() {
		System.out.println(">> TennisCoach: inside cleanMyStuff <<");
	}
	
	/*
	//define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method <<");
		fortuneService = theFortuneService;
	}
	
	
	@Autowired
	public void doSomeStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside doSoeStuff() method <<");
	}
	
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
		
	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
