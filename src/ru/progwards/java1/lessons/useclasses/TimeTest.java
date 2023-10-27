package ru.progwards.java1.lessons.useclasses;

public class TimeTest {
    public static void main(String[] args) {
        Time time0 = new Time(0, 0, 0);
        System.out.println(time0.toString());

        Time time1 = new Time(1, 2, 3);
        System.out.println(time1.toString());

        Time time2 = new Time(11, 12, 13);
        System.out.println(time2.toString());

        int test0 = time0.toSeconds();
        System.out.println("в time0 " + test0 + " секунд");

        int test1 = time1.toSeconds();
        System.out.println("в time1 " + test1 + " секунд");

        int test2 = time2.toSeconds();
        System.out.println("в time2 " + test2 + " секунд");

        int secondsBetween0and1 = time0.secondsBetween(time1);
        System.out.println("разница между time0 и time1 равна " + secondsBetween0and1 + " секунд");

        int secondsBetween2and0 = time2.secondsBetween(time0);
        System.out.println("разница между time2 и time0 равна " + secondsBetween2and0 + " секунд");

        int secondsBetween1and2 = time1.secondsBetween(time2);
        System.out.println("разница между time1 и time2 равна " + secondsBetween1and2 + " секунд");
    }
}