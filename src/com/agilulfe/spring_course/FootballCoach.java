package com.agilulfe.spring_course;

public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Go run some pass routes";
    }
}
