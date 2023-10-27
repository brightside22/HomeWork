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
        Count counter = new Count(count);
        while (true) {
            System.out.print(counter.getCount()-1 + " ");
            if (counter.getCount()==0){
                counter.dec();
                break;
            }
            else if (counter.dec()) {
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