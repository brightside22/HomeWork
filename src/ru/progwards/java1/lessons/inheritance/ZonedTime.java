package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time {
    public TimeZone zone;

    public ZonedTime(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
    }

    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) {
        super(hours, minutes, seconds);
        this.zone = zone;
    }

    public TimeZone getTimeZone() {
        return zone;
    }

    public int secondsBetween(Time time) {
            int tmz = 0;
            if (zone != null) {
                tmz = zone.getHours() * 3600 + zone.getMinutes() * 60;
            }


            int sec = TimeZone.getHours() * 3600 + TimeZone.getMinutes() * 60 - tmz;
            int sec1 = ZonedTime.hours * 3600 + ZonedTime.minutes * 60 + ZonedTime.seconds ;

            if (sec >= sec1) {
                return sec - sec1;}

            else {return sec1 - sec;}
        }


    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(20, 50, 11, new TimeZone(-3));
        ZonedTime zt2 = new ZonedTime(15, 52, 32, new TimeZone(-3));
        System.out.println(zt1.secondsBetween(zt2));
    }
}
