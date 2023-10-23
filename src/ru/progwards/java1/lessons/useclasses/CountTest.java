package ru.progwards.java1.lessons.useclasses;

public class CountTest {

    public static void testInc(int count) {
        Count count1 = new Count();

        for (int i = 0; i < count; i++ ) {
            count1.inc();
            System.out.print(count1.getCount() + " ");
        }

        System.out.println("\nтест inc окончен");
    }


    public static void testDec(int count) {
        Count count2 = new Count(count);

        while (count2.getCount() >= 0) {
            System.out.print(count2.getCount() + " ");
            if (count2.dec()) {
                System.out.println("\ncount равен 0");
                break;
            }
        }

        System.out.println("тест dec окончен");
    }

    public static void main(String[] args) {
        testInc(7);
        testInc(0);
        testInc(-1);
        testDec(9);
        testDec(0);
        testDec(-5);
    }
}