package com.luv2code.springdemo;

public class BaseballCoach  implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
		
	}
	
	public String getDailyWorkout()
	{
		return "spend 30 min in batting";
	}

	@Override
	public String getDailyFortune() {
		//  use my fortuneService to get a fortuneService
		return fortuneService.getFortune(); 
		
	}
}
