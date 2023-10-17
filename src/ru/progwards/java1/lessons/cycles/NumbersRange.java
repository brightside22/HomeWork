package ru.progwards.java1.lessons.cycles;

public class NumbersRange {
    public static long sumNumbers(int start, int finish) {
        int result = 0;
        for (; start <= finish; start++) {
            result += start;
        }
        return result;
    }

    public static long sumOdd(int start, int finish) {
        int result = 0;
        for (; start <= finish; start++) {
            if (start % 2 != 0)
                result += start;
        }
        return result;
    }

    public static long sumEvenIdx(int start, int finish) {
        int result = 0;
        int x = start;

        if (x % 2 != 0 || x == 1) {
            for (; start <= finish; start++) {
                if (start % 2 == 0)
                    result += start;
            }
            return result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenIdx(1, 5));
    }
}
