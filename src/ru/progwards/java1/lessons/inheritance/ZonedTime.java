package ru.progwards.java1.lessons.inheritance;
public class ZonedTime extends Time {
    private TimeZone zone;
    private int hours;
    private int minutes;
    private int seconds;

    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) {
        super(hours, minutes, seconds);
        this.zone = zone;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public ZonedTime(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
        this.zone = new TimeZone(0);
    }

    @Override
    public int secondsBetween(Time time) {
        int tmz = 0;
        int tmz1 = 0;


        if (this.zone != null) {
            tmz = zone.getHours()  *  3600 + zone.getMinutes()  *  60;
            tmz1 = TimeZone.hours *  3600 + TimeZone.minutes  *  60;
        }

        int sec= this.hours  *  3600 + this.minutes  *  60 + this.seconds- tmz1;
        int sec1 = super.hours  *  3600 + super.minutes  *  60 + super.seconds;

        if (sec >= sec1) {
            return sec - sec1;
        } else {
            return sec1 - sec;
        }
    }

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(19, 52, 2, new TimeZone(-2));
        ZonedTime zt2 = new ZonedTime(12, 0, 2, new TimeZone(2));
        System.out.println(zt1.secondsBetween(zt2));
        // 28320

        ZonedTime ztt1 = new ZonedTime(20, 56, 0, new TimeZone(-1));
        ZonedTime ztt2 = new ZonedTime(12, 7, 20, new TimeZone(1));
        System.out.println(ztt1.secondsBetween(ztt2));
        // 31720

        ZonedTime zttt1 = new ZonedTime(7, 2, 41, new TimeZone(-2));
        ZonedTime zttt2 = new ZonedTime(21, 1, 43, new TimeZone(-2));
        System.out.println(zttt1.secondsBetween(zttt2));
        //35942

        ZonedTime z1 = new ZonedTime(17, 34, 55, new TimeZone(0, 9));
        Time t1 = new Time(7, 39, 29);
        System.out.println(z1.secondsBetween(t1));
        //35186


    }
}



