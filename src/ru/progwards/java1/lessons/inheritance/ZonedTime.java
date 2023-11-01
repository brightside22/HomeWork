package ru.progwards.java1.lessons.inheritance;

class ZonedTime extends Time {
    TimeZone zone;

    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) {
        super(hours, minutes, seconds);
        this.zone = zone;
    }

    public TimeZone getTimeZone() {
        return zone;
    }

    public int secondsBetween(Time time) {
        int sec = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int sec1 = time.hours * 3600 + time.minutes * 60 + time.seconds;

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