package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);



        System.out.println(theCoach.getDailyFortune());
        System.out.println(alphaCoach.getDailyFortune());
        System.out.println(alphaCoach.getDailyFortune());

    }
}
