package ru.progwards.java1.lessons.compare;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        if ( a < b +c & b < a +c & c < b +a)
            return true;
        else
            return false;
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        if ( a*a + b*b ==  c*c | c*c + b*b == a*a | c*c + a*a == b*b)
            return true;
        else
            return false;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        if ( a==b | b==c | a==c)
            return true;
        else
            return false;
    }
}
