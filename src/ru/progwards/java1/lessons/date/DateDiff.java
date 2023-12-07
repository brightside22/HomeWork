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
        long year = (result / ( 315360000 * 100) );
        long month = (result % (315360000 * 100) ) /(2628 * 1000000);
        long days = (result % (315360000 * 100) ) % (2628 * 1000000) / 86400000;
        long min = ((result % (315360000 * 100) ) % (2628 * 1000000)  % 86400000) / 60000;
        long sec = ((result % (315360000 * 100) ) % (2628 * 1000000))  % 86400000 % 60000 / 1000;
        long milsec = ((result % (315360000 * 100) ) % (2628 * 1000000))  % 86400000 % 60000  % 1000;

        System.out.println("Между " + date1 + " и " + date2 + " " + year + "лет, " + month + " месяцев, "
                + days + " дней, " + min + " минут, " +  sec  + " секунд, " + milsec + "  миллисекунд");
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
        System.out.println("До дня рождения " + month + " месяцев, " + days + " дней, " + min + " минут, " +
                sec  + " секунд, " + milsec + "  миллисекунд");
    }

    public static void averageTime(Date[] events) {
        long year;
        long month ;
        long days ;
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
        min = cMin(average);
        sec = cSec(average);
        milsec = cMilSec(average);

        System.out.println("Среднее время между событиями " + year + " лет, " + month + " месяцев, " + days + " дней, " + min + " минут, " +
                sec  + " секунд, " + milsec + "  миллисекунд");
    }


    public static long cYear(long result) {
        return (result / ( 315360000 * 100) );
    }
    public static long cMonths(long result) {
        return (result % (315360000 * 100) ) /(2628 * 1000000);
    }

    public static long cDays(long result) {
        return (result % (315360000 * 100) ) % (2628 * 1000000) / 86400000;
    }

    public static long cMin(long result) {
        return  ((result % (315360000 * 100) ) % (2628 * 1000000)  % 86400000) / 60000;
    }

    public static long cSec(long result) {
        return ((result % (315360000 * 100) ) % (2628 * 1000000))  % 86400000 % 60000 / 1000;
    }

    public static long cMilSec(long result) {
        return ((result % (315360000 * 100) ) % (2628 * 1000000))  % 86400000 % 60000  % 1000;
    }

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        date2.setMinutes(date2.getMinutes() + 10);
        timeBetween(date1, date2);

    }




}