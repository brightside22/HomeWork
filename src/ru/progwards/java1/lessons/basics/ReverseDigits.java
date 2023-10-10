package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        System.out.print((number % 10));
        System.out.print((number % 100 / 10));
        System.out.print((number / 100));
        int num = number % 10 + number % 100 / 10 + number / 100;
        return num;
    }

    public static void main(String [] args) {
        reverseDigits(843);
    }


}
