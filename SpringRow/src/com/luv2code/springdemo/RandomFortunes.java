package com.luv2code.springdemo;

import java.sql.Array;
import java.util.Random;

public class RandomFortunes implements FortuneService{
    public static String[] fortunes =  {"You are so good!", " You will win a lot of money today", " Your future brights"};
    @Override
    public String getFortune() {
        var random = new Random();
        return fortunes[random.nextInt(3)];
    }
}
