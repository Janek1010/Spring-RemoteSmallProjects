package com.luv2code.springdemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    // create a no argument constructor

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    // setter
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practise fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
