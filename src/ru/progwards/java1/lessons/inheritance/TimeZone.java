package ru.progwards.java1.lessons.inheritance;
class TimeZone {
    public int hours;
    public int minutes;

    public TimeZone(int hours) {
        this.hours = hours;
    }

    public TimeZone(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public TimeZone getTimeZone() {
        return null;
    }
}