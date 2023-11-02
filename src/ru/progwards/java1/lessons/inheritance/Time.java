package ru.progwards.java1.lessons.inheritance;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }


    public int toSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }

    public int secondsBetween(Time time) {
        int sec = time.hours * 3600 + time.minutes * 60 + time.seconds;
        int sec1 = this.hours * 3600 + this.minutes * 60 + this.seconds;
        return sec;
    }
}

