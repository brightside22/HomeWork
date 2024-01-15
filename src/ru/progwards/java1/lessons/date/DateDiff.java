package ru.progwards.java1.lessons.date;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;



public class DateDiff {

    private final Date date;

    public DateDiff(Date date) {
        this.date = date;
    }

    public static void timeBetween(Date date1, Date date2) {

        long year = cYear(toCalendar(date1), toCalendar(date2)) - 1;
        String month =cMonths(toCalendar(date1), toCalendar(date2));
        long days = Long.parseLong(cDays(toCalendar(date1), toCalendar(date2)));
        long hours = Long.parseLong(cHours(toCalendar(date1), toCalendar(date2)));
        long min = Long.parseLong(cMin(toCalendar(date1), toCalendar(date2)));
        long sec = Long.parseLong(cSec(toCalendar(date1), toCalendar(date2)));
        long milsec = Long.parseLong(cMilSec(toCalendar(date1), toCalendar(date2)));

        System.out.println("Между " + "date1"+ " и " + "date2" + " " + year + " лет, " + month + " месяцев, "
                + days + " дней, "  + hours + " часов, " + min + " минут, " +  sec  + " секунд, " + milsec + "  миллисекунд");
    }

    public static Calendar toCalendar(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }


    public static void timeToBirthday(Date now, Date birthday) {
        long month = Long.parseLong(cMonths(toCalendar(now), toCalendar(birthday)));
        long days = Long.parseLong(cDays(toCalendar(now), toCalendar(birthday)));
        long min = Long.parseLong(cMin(toCalendar(now), toCalendar(birthday)));
        long sec = Long.parseLong(cSec(toCalendar(now), toCalendar(birthday)));
        long milsec = Long.parseLong(cMilSec(toCalendar(now), toCalendar(birthday)));
        long hours = Long.parseLong(cHours(toCalendar(now), toCalendar(birthday)));
        System.out.println("До дня рождения " + month + " месяцев, " + days + " дней, " + hours + " часов, " + min + " минут, " +
                sec  + " секунд, " + milsec + " миллисекунд");
    }

    public static void averageTime(Date[] events) {
        long totalDifference = 0;

        for (int i = 0; i < events.length - 1; i++) {
            long diff = events[i + 1].getTime() - events[i].getTime();
            totalDifference += diff;
        }

        long average = totalDifference / (events.length - 1);

        long milliseconds = average % 1000;
        average /= 1000;
        long seconds = (average % 60)-1;
        average /= 60;
        long minutes = (average % 60)-1;
        average /= 60;
        long hours = (average % 24)-1;
        average /= 24;
        long days = (average % 30)-1;
        average /= 30;
        long months = average % 12;
        long years = average / 12;

        System.out.println("Среднее время между событиями " + years + " лет, " + months + " месяцев, " +
                days + " дней, " + hours + " часов, " + minutes + " минут, " +
                seconds + " секунд, " + milliseconds + " миллисекунд");
    }


    public static long cYear(Calendar date1, Calendar date2) {
        return Math.abs(date2.get(Calendar.YEAR) - date1.get(Calendar.YEAR));
    }
    public static String cMonths(Calendar date1, Calendar date2) {
        long[] timeDiff = new long[2];
        timeDiff[1] += (date2.get(Calendar.MONTH) - date1.get(Calendar.MONTH)) ; // month
        if (timeDiff[1] < 0) {
            timeDiff[1] += 12;
            timeDiff[0] = -1;
        }

        String str = String.valueOf(timeDiff[1]);
        return str;
    }

    public static String cDays( Calendar date1, Calendar date2) {
        long[] timeDiff = new long[3];
        timeDiff[2] += (date2.get(Calendar.DATE) - date1.get(Calendar.DATE)); // day
        if (timeDiff[2] < 0) {
            timeDiff[2] += 30;
            timeDiff[1] = -1;
        }
       String str = String.valueOf(timeDiff[2]);
        return str;
    }

    public static String cHours( Calendar date1, Calendar date2) {
        long[] timeDiff = new long[4];
        timeDiff[3] += (date2.get(Calendar.HOUR_OF_DAY) - date1.get(Calendar.HOUR_OF_DAY)); // hour
        if (timeDiff[3] < 0) {
            timeDiff[3] += 24;
            timeDiff[2] = -1;
        }
        String str = String.valueOf(timeDiff[3]);
        return str;
    }

    public static String cMin( Calendar date1, Calendar date2) {
        long[] timeDiff = new long[5];
        timeDiff[4] += (date2.get(Calendar.MINUTE) - date1.get(Calendar.MINUTE)); // min
        if (timeDiff[4] < 0) {
            timeDiff[4] += 60;
            timeDiff[3] = -1;
        }
        String str = String.valueOf(timeDiff[4]);
        return str;

    }

    public static String cSec( Calendar date1, Calendar date2) {
        long[] timeDiff = new long[6];
        timeDiff[5] += (date2.get(Calendar.SECOND) - date1.get(Calendar.SECOND)) ; // sec
        if (timeDiff[5] < 0) {
            timeDiff[5] += 60;
            timeDiff[4] = -1;
        }

        String str = String.valueOf(timeDiff[5]);
        return str;

    }

    public static String cMilSec( Calendar date1, Calendar date2) {
        long[] timeDiff = new long[7];
        timeDiff[6] = (date2.get(Calendar.MILLISECOND) - date1.get(Calendar.MILLISECOND)) ; // ms
        if (timeDiff[6] < 0) {
            timeDiff[6] += 1000;
            timeDiff[5] = -1;
        }
        String str = String.valueOf(timeDiff[6]);
        return str;

    }

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();

        date1.setYear(2089-1900);
        date1.setMonth(10);
        date1.setDate(22);
        date2.setHours(13);
        date2.setMinutes(30);
        date2.setSeconds(37);


        date2.setYear(2083-1900);
        date2.setMonth(6);
        date2.setDate(11);
        date2.setHours(6);
        date2.setMinutes(48);
        date2.setSeconds(39);

       timeBetween(date1, date2);


    }









}