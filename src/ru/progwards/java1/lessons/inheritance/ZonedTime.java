package ru.progwards.java1.lessons.inheritance;

class ZonedTime extends Time {
    private TimeZone zone;  // часовой пояс

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
        int totalSeconds = super.secondsBetween(time);
        TimeZone otherTimeZone = getTimeZone();
        if (otherTimeZone != null) {
            int secondsDiff = (zone.hours - otherTimeZone.hours) * 3600 + (zone.minutes - otherTimeZone.minutes) * 60;
            totalSeconds += secondsDiff;
        }
        return totalSeconds;
    }

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(5, 5, 27, new TimeZone(1, 34));
        Time t1 = new Time(18, 37, 8);
        System.out.println(zt1.secondsBetween(t1));
    }
}