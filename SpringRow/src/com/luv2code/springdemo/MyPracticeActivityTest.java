package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyPracticeActivityTest {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach testCoach = context.getBean("myHockeyCoach", HockeyCoach.class);

        System.out.println(testCoach.getDailyFortune());
        System.out.println(testCoach.getDailyFortune());
        System.out.println(testCoach.getDailyFortune());
        System.out.println(testCoach.getDailyFortune());
        System.out.println(testCoach.getDailyFortune());
        System.out.println(testCoach.getDailyFortune());
        System.out.println(testCoach.getDailyFortune());

        context.close();

    }

}
