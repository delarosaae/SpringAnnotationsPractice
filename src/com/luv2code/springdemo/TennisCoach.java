package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach()
	{
		System.out.println(">> inside default constructor");
	}
	
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println(">> TennisCOach: inside setFortuneService() method");
		fortuneService = theFortuneService;
	}
	
	/**
	@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Work on your backhand";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
