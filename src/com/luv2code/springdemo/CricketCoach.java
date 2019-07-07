/**
 * 
 */
package com.luv2code.springdemo;

/**
 * @author Purushotham.Reddy
 *
 */
public class CricketCoach implements Coach {

	private FortuneService fortuneService; 

	//add new fields for email address and team
	private String emailAddress;
	private String team;
	
	
	public void setFortuneService(FortuneService fortuneService) {
	System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress()
	{
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress=emailAddress;
	}
	
	public String getTeam()
	{
		return team;
	}
	
	public void setTeam(String team)
	{
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}
	
	
	//no-arg constructor
	public 	CricketCoach()
	{
		System.out.println("CricketCoach: Inside no-arg constructor");
	}
	
	 
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice fast bowling for 15 min !!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
