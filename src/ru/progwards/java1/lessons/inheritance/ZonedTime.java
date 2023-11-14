package ru.progwards.java1.lessons.inheritance;


public class ZonedTime extends Time {
    private TimeZone zone;

    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) {
        super(hours, minutes, seconds);
        this.zone = zone;
    }

    public ZonedTime(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
        this.zone = new TimeZone(0);
    }

    public TimeZone getTimeZone() {
        return zone;
    }


    @Override
    public int secondsBetween(Time time) {
        int tmz = 0;

        if (zone != null) {
            tmz = getTimeZone().hours *  3600 + getTimeZone().minutes  *  60;
        }

        int sec = this.toSeconds() - tmz;
        int sec1 = time.toSeconds();

       return Math.abs(sec-sec1);
    }

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(11, 39, 48, new TimeZone(-2));
        ZonedTime zt2 = new ZonedTime(14, 48, 38, new TimeZone(-2));
        System.out.println(zt1.secondsBetween(zt2));
        // 3070

        ZonedTime z1 = new ZonedTime(17, 34, 55, new TimeZone(0, 9));
        Time t1 = new Time(7, 39, 29);
        System.out.println(z1.secondsBetween(t1));
        //35186


        ZonedTime zzt1 = new ZonedTime(19, 52, 2, new TimeZone(-2));
        ZonedTime zzt2 = new ZonedTime(12, 0, 2, new TimeZone(2));
        System.out.println(zzt1.secondsBetween(zzt2));
        // 28320

        ZonedTime ztt1 = new ZonedTime(20, 56, 0, new TimeZone(-1));
        ZonedTime ztt2 = new ZonedTime(12, 7, 20, new TimeZone(1));
        System.out.println(ztt1.secondsBetween(ztt2));
        // 31720

        ZonedTime zttt1 = new ZonedTime(7, 2, 41, new TimeZone(-2));
        ZonedTime zttt2 = new ZonedTime(21, 1, 43, new TimeZone(-2));
        System.out.println(zttt1.secondsBetween(zttt2));
            //35942

    }
}



