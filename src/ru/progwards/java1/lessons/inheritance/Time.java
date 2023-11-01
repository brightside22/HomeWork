package ru.progwards.java1.lessons.inheritance;
class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int secondsBetween(Time time) {
        int totalSeconds1 = hours * 3600 + minutes * 60 + seconds;
        int totalSeconds2 = time.getHours() * 3600 + time.getMinutes() * 60 + time.getSeconds();
        if (totalSeconds1 >= totalSeconds2) {
            return totalSeconds1 - totalSeconds2;
        } else {
            return totalSeconds2 - totalSeconds1;
        }
    }
}
