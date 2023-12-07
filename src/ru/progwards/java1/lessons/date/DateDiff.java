package ru.progwards.java1.lessons.date;
import java.util.Date;
import java.util.Calendar;

public class DateDiff {

    private final Date date;
    long result;

    public DateDiff(Date date) {
        this.date = date;
    }

    public static void timeBetween(Date date1, Date date2) {
        long d1 =  date1.getTime();
        long d2 =  date2.getTime();
        long result = Math.abs(d2 - d1);
        long year = (result / ( 31536000000L));
        long month = (result % (31536000000L) ) /(2628000000L);
        long days = ((result % (31536000000L) ) % (2628000000L)) / 86400000L;
        long hours = ((((result % (31536000000L) ) % (2628000000L)) % 86400000) / 3600000);
        long min = (((((result % (31536000000L) ) % (2628000000L)) % 86400000)  % 3600000)/ 60000);
        long sec = (((((result % (31536000000L) ) % (2628000000L)) % 86400000)  % 3600000) % 60000) / 1000;
        long milsec = (((((result % (31536000000L) ) % (2628000000L)) % 86400000)  % 3600000) % 60000) % 1000;

        System.out.println("Между " + date1 + " и " + date2 + " " + year + "лет, " + month + " месяцев, "
                + days + " дней, "  + hours + " часов, " + min + " минут, " +  sec  + " секунд, " + milsec + "  миллисекунд");
    }

    public static void timeToBirthday(Date now, Date birthday) {
        long d1 =  now.getTime();
        long d2 =  birthday.getTime();
        long result = Math.abs(d2 - d1);

        long month = cMonths(result);
        long days = cDays(result);
        long min = cMin(result);
        long sec = cSec(result);
        long milsec = cMilSec(result);
        long hours = cHours(result);
        System.out.println("До дня рождения " + month + " месяцев, " + days + " дней, " + hours + " часов, " + min + " минут, " +
                sec  + " секунд, " + milsec + "  миллисекунд");
    }

    public static void averageTime(Date[] events) {
        long year;
        long month ;
        long days ;
        long hours;
        long min ;
        long sec;
        long milsec ;
        long all = 0;
        long all1 = 0;
        long average;

        for( int i = 1; i<events.length; i++) {
            all = events[0].getTime();
            all1 -= events[i].getTime();
        }
        average = all / events.length;
        year = cYear(average);
        month = cMonths(average);
        days = cDays(average);
        hours = cHours(average);
        min = cMin(average);
        sec = cSec(average);
        milsec = cMilSec(average);

        System.out.println("Среднее время между событиями " + year + " лет, " + month + " месяцев, " + days + " дней, " + hours + " часов, "+ min + " минут, " +
                sec  + " секунд, " + milsec + "  миллисекунд");
    }


    public static long cYear(long result) {
        return (result / ( 31536000000L));
    }
    public static long cMonths(long result) {
        return (result % (31536000000L) ) /(2628000000L);
    }

    public static long cDays(long result) {
        return (result % (31536000000L) ) % (2628000000L) / 86400000L;
    }

    public static long cHours(long result) {
        return  ((((result % (31536000000L) ) % (2628000000L)) % 86400000) / 3600000);
    }

    public static long cMin(long result) {
        return  ((result % (31536000000L) ) % (2628000000L)  % 86400000L) / 60000;
    }

    public static long cSec(long result) {
        return ((result % (31536000000L) ) % (2628000000L))  % 86400000L % 60000 / 1000;
    }

    public static long cMilSec(long result) {
        return ((result % (31536000000L) ) % (2628000000L))  % 86400000L % 60000  % 1000;
    }

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        date2.setYear(date2.getYear()+3);
        date2.setMonth(date2.getMonth() +4);
        timeBetween(date1, date2);

    }




}