package com.fshan.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 10k";
	}

	@Override
	public String getDailyFortune() {
		
		
		return "Just Do it: " + fortuneService.getFortune();
	}
	
	//add an init method
	public void walkingMyDog() {
		System.out.println("TrackCoach: inside method walkingMyDog");
	}
	
	//add a destory method
	public void walkingMyCat() {
		System.out.println("TrackCoach: inside method walkingMyCat");
	}
	
}
