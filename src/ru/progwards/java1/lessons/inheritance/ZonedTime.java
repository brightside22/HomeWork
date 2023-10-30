package ru.progwards.java1.lessons.inheritance;


class ZonedTime extends Time {
    private TimeZone zone;

    public ZonedTime(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
        this.zone = new TimeZone(0);
    }

    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) {
        super(hours, minutes, seconds);
        this.zone = zone;
    }

    public TimeZone getTimeZone() {
        return zone;
    }


    public int secondsBetween(Time time) {
        int seconds = super.secondsBetween(time);
        if (zone != null) {
            seconds += zone.hours * 3600 + zone.minutes * 60;
        }
        return seconds;
    }


    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(5, 5, 27, new TimeZone(1, 34));
        Time t1 = new Time(18, 37, 8);
        System.out.println(zt1.secondsBetween(t1));
    }

}