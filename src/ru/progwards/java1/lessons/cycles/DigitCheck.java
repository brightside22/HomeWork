package ru.progwards.java1.lessons.cycles;

public class DigitCheck {

    public static boolean containsDigit(int number, int digit) {
        if (number == 0 && digit == 0) {
            return true;
        }

        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit == digit) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDigit(12345, 3));
    }
}
