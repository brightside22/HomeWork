package ru.progwards.java1.lessons.inheritance;

public class ZonedTime extends Time {
    public static TimeZone zone;

    public ZonedTime(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
    }

    public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) {
        super(hours, minutes, seconds);
        zone = new TimeZone(0);
    }

    public TimeZone getTimeZone() {
        return zone;
    }



    @Override
    public int secondsBetween(Time time) {
        int tmz1 = 0;
        if (zone != null) {
            TimeZone timeZone = getTimeZone();
            tmz1 = timeZone.getHours() * 3600 + timeZone.getMinutes() * 60;
        }

            int sec = time.hours * 3600 + time.minutes * 60 + time.seconds;
            int sec1 = this.hours * 3600 + this.minutes * 60 + this.seconds - tmz1;

            if (sec >= sec1) {
                return sec - sec1;
            } else {
                return sec1 - sec;
            }
        }


    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(11, 50, 5, new TimeZone(1));
        ZonedTime zt2 = new ZonedTime(4, 12, 40, new TimeZone(-3));

        System.out.println(zt1.secondsBetween(zt2));
//34645

//71892
    }
}