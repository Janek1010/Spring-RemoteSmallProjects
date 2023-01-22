package com.luv2code.springdemo;

public class HockeyCoach implements Coach {
    private FortuneService randomFortunes;

    public HockeyCoach() {
    }


    public HockeyCoach(FortuneService randomFortunes) {
        this.randomFortunes = randomFortunes;
    }

    @Override
    public String getDailyWorkout() {
        return "I like ice!!";
    }

    @Override
    public String getDailyFortune() {
        return randomFortunes.getFortune();
    }
}
