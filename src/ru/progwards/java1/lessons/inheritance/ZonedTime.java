package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time {
    private TimeZone zone;

    public ZonedTime(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
    }

    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) {
        super(hours, minutes, seconds);
    }

    public TimeZone getTimeZone() {
        return zone;
    }
}
