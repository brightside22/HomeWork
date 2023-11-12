package ru.progwards.java1.lessons.inheritance;


public class ZonedTime extends Time {
   public TimeZone zone;
    public static int hours1;
    public static int minutes1;
    public static int seconds1;
    public ZonedTime(int hours1, int minutes1, int seconds1, TimeZone zone) {
        super(hours1, minutes1, seconds1);
        this.zone = zone;
        this.hours1 = hours1;
        this.minutes1 = minutes1;
        this.seconds1 = seconds1;
    }

    public ZonedTime(int hours1, int minutes1, int seconds1) {
        super(hours1, minutes1, seconds1);
    }


    public int secondsBetween(Time time) {
        int tmz = 0;

        if (zone != null) {
            tmz = zone.getHours() * 3600 + zone.getMinutes() * 60;
        }

        int sec = super.hours * 3600 + super.minutes * 60 + super.seconds - tmz;
        int sec1 = this.hours1 * 3600 + this.minutes1 * 60 + this.seconds1;

        if (sec >= sec1) {
            return sec - sec1;}

        else {return sec1 - sec;}
    }
//54341

    public static void main(String[] args) {
        ZonedTime zt1 = new ZonedTime(5, 5, 27, new TimeZone(1, 34));
        Time t1 = new Time(18, 37, 8);
        System.out.println(zt1.secondsBetween(t1));

    }
}



