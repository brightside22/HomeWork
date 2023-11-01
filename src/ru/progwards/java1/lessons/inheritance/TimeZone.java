package ru.progwards.java1.lessons.inheritance;
class TimeZone {
    private int hours;
    private int minutes;

    public TimeZone(int hours) {
        this.hours = hours;
        this.minutes = 0;
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

    public ZonedTime getTimeZone() {
        return null;
    }
}
