package ru.progwards.java1.lessons.inheritance;


public class ZonedTime extends Time {
     TimeZone zone;

    public ZonedTime(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
    }

    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) {
        super(hours, minutes, seconds);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.zone = zone;
    }

    public TimeZone getTimeZone() {
        return zone;
    }

    public int secondsBetween(Time time) {
        TimeZone tmz = getTimeZone();
        int hours1 = TimeZone.hours * 3600;
        int minutes1 = TimeZone.minutes * 60;

        int sec =  ZonedTime.hours *  3600 + ZonedTime.minutes  *  60 + ZonedTime.seconds - hours1 - minutes1;
        int sec1 = Time.hours * 3600 + Time.minutes * 60 + Time.seconds;

        if (sec >= sec1) {
            return sec - sec1;
        } else {
            return sec1 - sec;
        }
    }
//54341

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(15, 39, 42, new TimeZone(-3, 2));
        Time t1 = new Time(22, 1, 36);
        System.out.println(zt1.secondsBetween(t1));
        System.out.println(ZonedTime.hours);
        System.out.println(Time.hours);

    }
}
