package com.luv2code.springdemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    private String emailAddress;
    private String team;


    // create a no argument constructor

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    // setter
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter setFortuneService");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter setTeam");
        this.team = team;
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
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
