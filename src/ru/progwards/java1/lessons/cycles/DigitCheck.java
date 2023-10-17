package ru.progwards.java1.lessons.cycles;

public class DigitCheck {


    public static boolean containsDigit(int number, int digit) {
        int r=404;
        int y=10;

        for (int x = 10; number/x!=0 || (number % x )/(x/10) == digit; x*=10) {
            if (number%10==digit)
                r=1;
            else if ((number % x )/(x/10) == digit) {
                r = 1;
            } else {
                r = 0;
            }
        }

         if (r==1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDigit(333, 3));
    }
}
