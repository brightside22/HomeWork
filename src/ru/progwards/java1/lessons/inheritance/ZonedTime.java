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

    @Override
    public int secondsBetween(Time time) {
        TimeZone t = getTimeZone();

        int sec1 = super.secondsBetween(time);
        int sec2 = t.getHours() * 3600 + t.getMinutes() * 60;

        if (sec2 >= sec1) {
            return sec2 - sec1;
        } else {
            return sec1 - sec2;
        }
    }

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(22, 39, 45, new TimeZone(-3, 20));
        Time t1 = new Time(14, 17, 11);
        System.out.println(zt1.secondsBetween(t1));
        System.out.println(t1);
        System.out.println(zt1);
        System.out.println(zt1.getTimeZone());
    }
}