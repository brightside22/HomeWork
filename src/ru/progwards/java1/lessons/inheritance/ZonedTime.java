package ru.progwards.java1.lessons.inheritance;

class ZonedTime extends Time {
    TimeZone zone;


    public ZonedTime(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
        TimeZone zone = new TimeZone(0);
    }

    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) {
        super(hours, minutes, seconds);
        this.zone = zone;
    }


    public TimeZone getTimeZone() {
        return zone;
    }

    @Override
    public int secondsBetween(Time time) {
        TimeZone t = getTimeZone();

        int sec = ZonedTime.hours * 3600 + ZonedTime.minutes * 60 +
                ZonedTime.seconds - TimeZone.hours * 3600 - TimeZone.minutes * 60;
        int sec1 = Time.hours * 3600 + Time.minutes * 60 + Time.seconds;

        if (sec >= sec1) {
            return sec - sec1;
        } else {
            return sec1 - sec;
        }
    }

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(22, 39, 45, new TimeZone(-3, 20));
        Time t1 = new Time(14, 17, 11);
        System.out.println(zt1.secondsBetween(t1));
        System.out.println(t1);
        System.out.println(zt1);
    }
}