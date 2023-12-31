package ru.progwards.java1.lessons.useclasses;
public class CountTest {
    public static void testInc(int count) {
        Count counter = new Count();
        for (int i = 0; i < count; i++) {
            counter.inc();
            System.out.print(counter.getCount() + " ");
        }
    }

    public static void testDec(int count) {
        Count count1 = new Count(count);
        while (true) {
            System.out.print(count1.getCount()-1 + " ");
            if (count1.getCount() <= 0) {
                break;
            }

            if (count1.dec()) {
                System.out.print("\ncount равен 0");
                break;
            }
        }
        System.out.println("\nтест dec окончен");
    }


    public static void main(String[] args) {
        testInc(7);
        System.out.print("\nтест inc окончен\n");
        testInc(0);
        System.out.print("тест inc окончен\n");
        testInc(-1);
        System.out.print("тест inc окончен\n");


        testDec(9);
        testDec(0);
        testDec(-5);
    }
}