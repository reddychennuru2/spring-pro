package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do track practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just do it : "+fortuneService.getFortune(); 
		 
	}
	
	public TrackCoach() {}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	
	//add an init method
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
		
	}
	//add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
		
	}
	
}
