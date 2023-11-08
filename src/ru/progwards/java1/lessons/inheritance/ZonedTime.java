package ru.progwards.java1.lessons.inheritance;

import org.w3c.dom.ls.LSOutput;

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


        if (zone != null) {
            tmz = zone.getHours()  *  3600 + zone.getMinutes()  *  60;
        }
        int sec = time.hours * 3600 + time.minutes * 60 + time.seconds;
        int sec1 = this.hours * 3600 + this.minutes * 60 + this.seconds;

        if (sec >= sec1) {
            return sec - sec1;}

        else {return sec1 - sec;}
    }
//54341

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(5, 5, 27, new TimeZone(1, 34));
        Time t1 = new Time(18, 37, 8);
        System.out.println(zt1.secondsBetween(t1));
        System.out.println(ZonedTime.hours);
        System.out.println(TimeZone.getHours());
        System.out.println(zt1);
        System.out.println(t1);
    }
}











class Gun {
    String model;
    double caliber;

    public Gun(String model, double caliber) {
        this.model = model;
        this.caliber = caliber;
    }

    int compareTo(Gun gun) {
        return Double.compare(caliber, gun.caliber);
    }


    static void sortGuns(Gun gun1, Gun gun2) {
        double  caliber1 = gun1.caliber;
        double  caliber2 = gun2.caliber;

        if (caliber1 > caliber2)
            System.out.println(gun1 + ", " + gun2);
        else
            System.out.println(gun2 + ", " + gun1);
    }}