package com.agilulfe.spring_course;

import java.lang.Math;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        String[] fortuneArray = {"Today is your lucky day!", "Seize your opportunities", "Go for it!"};
        int index = (int) (Math.random() * 3);
        return fortuneArray[index];
    }
}
