package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        return number = number % 10 * 100 + number % 100 / 10 * 10 + number / 100;
    }
}
