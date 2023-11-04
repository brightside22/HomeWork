package ru.progwards.java1.lessons.cycles;

public class NumbersRange {
    public static long sumNumbers(int start, int finish) {
        long result = 0;
        for (; start <= finish; start++) {
            result += start;
        }
        return result;
    }

    public static long sumOdd(int start, int finish) {
        long result = 0;
        for (; start <= finish; start++) {
            if (start % 2 == 0)
                result += start;
        }
        return result;
    }


    public static long sumEvenIdx(int start, int finish) {
        long result = 0;
        for (int i = 0; start + i <= finish; i++) {
            if (i % 2 == 0) {
                result += start + i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenIdx(1, 5));
    }

}