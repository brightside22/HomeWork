package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time {
    public TimeZone zone;

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
        int timeZoneOffset = 0;
        if (zone != null) {
            timeZoneOffset = zone.getHours() * 3600 + zone.getMinutes() * 60;
        }
        int time1Seconds = this.getHours() * 3600 + this.getMinutes() * 60 + this.getSeconds() - timeZoneOffset;
        int time2Seconds = time.getHours() * 3600 + time.getMinutes() * 60 + time.getSeconds();
        return (time2Seconds - time1Seconds);
    }


    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(15, 44, 3, new TimeZone(-1, 44));
        Time t1 = new Time(17, 25, 1);
        System.out.println(zt1.secondsBetween(t1));
    }
}
