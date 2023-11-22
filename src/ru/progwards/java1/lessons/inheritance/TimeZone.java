package ru.progwards.java1.lessons.inheritance;
class TimeZone {
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

    public static int getSeconds() {
        return 0;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public TimeZone getTimeZone() {
        return null;
    }

}