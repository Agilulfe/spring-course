package com.agilulfe.spring_course;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Go run 10km";
    }
}
