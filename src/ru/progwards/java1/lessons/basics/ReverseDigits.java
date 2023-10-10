package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        System.out.print((number % 10));
        System.out.print((number % 100 / 10));
        System.out.print((number / 100));
        return number;
    }
}
