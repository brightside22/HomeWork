package ru.progwards.java1.lessons.date;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;



public class DateDiff {

    private final Date date;

    public DateDiff(Date date) {
        this.date = date;
    }

    public static void timeBetween(Calendar date1, Calendar date2) {

        long year = cYear(date1, date2);
        long month =cMonths(date1, date2);
        long days = cDays(date1, date2);
        long hours = cHours(date1, date2);
        long min = cMin(date1, date2);
        long sec = cSec(date1, date2);
        long milsec = cMilSec(date1, date2);

        System.out.println("Между " + "date1"+ " и " + "date2" + " " + year + "лет, " + month + " месяцев, "
                + days + " дней, "  + hours + " часов, " + min + " минут, " +  sec  + " секунд, " + milsec + "  миллисекунд");
    }

    public static void diffDate(int[] timeDiff, Calendar date1, Calendar date2){
        timeDiff[6] = (date2.get(Calendar.MILLISECOND) - date1.get(Calendar.MILLISECOND)) ; // ms
        if (timeDiff[6] < 0) {
            timeDiff[6] += 1000;
            timeDiff[5] = -1;
        }
        timeDiff[5] += (date2.get(Calendar.SECOND) - date1.get(Calendar.SECOND)) ; // sec
        if (timeDiff[5] < 0) {
            timeDiff[5] += 60;
            timeDiff[4] = -1;
        }
        timeDiff[4] += (date2.get(Calendar.MINUTE) - date1.get(Calendar.MINUTE)); // min
        if (timeDiff[4] < 0) {
            timeDiff[4] += 60;
            timeDiff[3] = -1;
        }
        timeDiff[3] += (date2.get(Calendar.HOUR_OF_DAY) - date1.get(Calendar.HOUR_OF_DAY)); // hour
        if (timeDiff[3] < 0) {
            timeDiff[3] += 24;
            timeDiff[2] = -1;
        }
        timeDiff[2] += (date2.get(Calendar.DATE) - date1.get(Calendar.DATE)) ; // day
        if (timeDiff[2] < 0) {
            timeDiff[2] += 30;
            timeDiff[1] = -1;
        }
        timeDiff[1] += (date2.get(Calendar.MONTH) - date1.get(Calendar.MONTH)) ; // month
        if (timeDiff[1] < 0) {
            timeDiff[1] += 12;
            timeDiff[0] = -1;
        }
        timeDiff[0] += (date2.get(Calendar.YEAR) - date1.get(Calendar.YEAR)) ; // year

    }

    public static void timeToBirthday(Calendar now, Calendar birthday) {
        long month = cMonths(now, birthday);
        long days = cDays(now, birthday);
        long min = cMin(now, birthday);
        long sec = cSec(now, birthday);
        long milsec = cMilSec(now, birthday);
        long hours = cHours(now, birthday);
        System.out.println("До дня рождения " + month + " месяцев, " + days + " дней, " + hours + " часов, " + min + " минут, " +
                sec  + " секунд, " + milsec + "  миллисекунд");
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
        long seconds = average % 60;
        average /= 60;
        long minutes = average % 60;
        average /= 60;
        long hours = average % 24;
        average /= 24;
        long days = average % 30;
        average /= 30;
        long months = average % 12;
        long years = average / 12;

        System.out.println("Среднее время между событиями " + years + " лет, " + months + " месяцев, " +
                days + " дней, " + hours + " часов, " + minutes + " минут, " +
                seconds + " секунд, " + milliseconds + " миллисекунд");
    }


    public static long cYear(Calendar date1, Calendar date2) {
        int[] timeDiff = new int[0];
        timeDiff[0] += (date2.get(Calendar.YEAR) - date1.get(Calendar.YEAR)) ;
        return Long.valueOf(Arrays.toString(timeDiff)); // year
    }
    public static long cMonths(Calendar date1, Calendar date2) {
        int[] timeDiff = new int[0];
        timeDiff[1] += (date2.get(Calendar.MONTH) - date1.get(Calendar.MONTH)) ; // month
        if (timeDiff[1] < 0) {
            timeDiff[1] += 12;
            timeDiff[0] = -1;
        }
        return Long.valueOf(Arrays.toString(timeDiff));
    }

    public static long cDays( Calendar date1, Calendar date2) {
        int[] timeDiff = new int[0];
        timeDiff[2] += (date2.get(Calendar.DATE) - date1.get(Calendar.DATE)); // day
        if (timeDiff[2] < 0) {
            timeDiff[2] += 30;
            timeDiff[1] = -1;
        }
        return Long.valueOf(Arrays.toString(timeDiff));
    }

    public static long cHours( Calendar date1, Calendar date2) {
        int[] timeDiff = new int[0];
        timeDiff[3] += (date2.get(Calendar.HOUR_OF_DAY) - date1.get(Calendar.HOUR_OF_DAY)); // hour
        if (timeDiff[3] < 0) {
            timeDiff[3] += 24;
            timeDiff[2] = -1;
        }
        return Long.valueOf(Arrays.toString(timeDiff));
    }

    public static long cMin( Calendar date1, Calendar date2) {
        int[] timeDiff = new int[0];
        timeDiff[4] += (date2.get(Calendar.MINUTE) - date1.get(Calendar.MINUTE)); // min
        if (timeDiff[4] < 0) {
            timeDiff[4] += 60;
            timeDiff[3] = -1;
        }
        return Long.valueOf(Arrays.toString(timeDiff));
    }

    public static long cSec( Calendar date1, Calendar date2) {
        int[] timeDiff = new int[0];
        timeDiff[5] += (date2.get(Calendar.SECOND) - date1.get(Calendar.SECOND)) ; // sec
        if (timeDiff[5] < 0) {
            timeDiff[5] += 60;
            timeDiff[4] = -1;
        }
        return Long.valueOf(Arrays.toString(timeDiff));
    }

    public static long cMilSec( Calendar date1, Calendar date2) {
        int[] timeDiff = new int[0];
        timeDiff[6] = (date2.get(Calendar.MILLISECOND) - date1.get(Calendar.MILLISECOND)) ; // ms
        if (timeDiff[6] < 0) {
            timeDiff[6] += 1000;
            timeDiff[5] = -1;
        }
        return Long.valueOf(Arrays.toString(timeDiff));
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





    }




}