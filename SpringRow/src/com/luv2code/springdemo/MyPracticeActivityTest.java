package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyPracticeActivityTest {
    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoachSingleton = context.getBean("myHockeyCoach", Coach.class);
        Coach theCoachSingleton2 = context.getBean("myHockeyCoach", Coach.class);
        Coach theCoachPrototype = context.getBean("myHockeyCoachPrototype", Coach.class);
        Coach theCoachPrototype2 = context.getBean("myHockeyCoachPrototype", Coach.class);


        System.out.println("Prototypes:");
        System.out.println(theCoachPrototype==theCoachPrototype2);
        System.out.println("Singleton");
        System.out.println(theCoachSingleton == theCoachSingleton2);

        context.close();

    }

}
