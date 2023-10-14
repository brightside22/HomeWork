package ru.progwards.java1.lessons.compare;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        if (a > b & a > c)
            return a;
        if (b > a & b > c)
            return b;
        else
            return c;
    }

    public static int minSide(int a, int b, int c) {
            if (a < b & a < c)
                return a;
            if (b < a & b < c)
                return b;
            else
                return c;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        boolean result1 = a == b & b == c;
            return result1;
    }
}
