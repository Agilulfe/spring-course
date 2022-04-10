package com.agilulfe.spring_course;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Go run some pass routes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
