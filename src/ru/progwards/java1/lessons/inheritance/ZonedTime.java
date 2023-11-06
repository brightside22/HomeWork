package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time {
    public static TimeZone zone;

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
        int tmz1 = 0;


        if (zone != null) {
            tmz = zone.getHours()  *  3600 + zone.getMinutes()  *  60;
        }

        int sec = ((TimeZone.getHours() * 3600) + (TimeZone.getMinutes() * 60) + ZonedTime.seconds);
        int sec1 = ZonedTime.hours *  3600 + ZonedTime.minutes  *  60 + ZonedTime.seconds - tmz ;

        if (sec >= sec1) {
            return sec - sec1;
        } else {
            return sec1 - sec;
        }
    }
//54341

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(5, 5, 27, new TimeZone(1, 34));
        Time t1 = new Time(18, 37, 8);
        System.out.println(zt1.secondsBetween(t1));
        System.out.println(zone.getHours());
        System.out.println(ZonedTime.hours);
        System.out.println(TimeZone.getHours());
        System.out.println(zt1);
        System.out.println(t1);
    }
}