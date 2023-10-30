package ru.progwards.java1.lessons.inheritance;

public class TimeZone {
    int hours;
    int minutes;

    public TimeZone(int hours) {
        this.hours = hours;
        this.minutes = 0;
    }

    public TimeZone(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public TimeZone getTimeZone() {
        return null;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
