package ru.progwards.java1.lessons.inheritance;

class TimeZone {
    static int hours;
    int minutes;

    public TimeZone(int hours) {
        this.hours = hours;
        this.minutes = 0;
    }

    public TimeZone(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public static int getHours() {
        return hours;
    }

    public static int getMinutes() {
        return hours;
    }

    public TimeZone getTimeZone() {
        return null;
    }
}