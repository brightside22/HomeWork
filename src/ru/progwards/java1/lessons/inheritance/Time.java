package ru.progwards.java1.lessons.inheritance;

class Time {
    protected int hours;
    protected int minutes;
    protected int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int toSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

}