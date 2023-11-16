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

        ZonedTime z1 = new ZonedTime(17, 34, 55, new TimeZone(0, 9));
        Time t1 = new Time(7, 39, 29);
        System.out.println(z1.secondsBetween(t1));
        //35186



    }

    int[][] m = {{}};
    int sum = arraySum2(m, 0);

    public int arraySum2(int[][] m, int n) {
        int z = 0;
        for (int i = 0; i < m.length; i++) {
            z += m[n][n];
        }
        return z;
    }
    
}


