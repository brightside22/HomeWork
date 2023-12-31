package ru.progwards.java1.lessons.custing;

public class Figures {
    static final double PI = 3.14;

    public static double circle(double r) {
        double s = PI * r * r;
        return s;
    }

    public static double square(double n) {
        double s = (n * n);
        return s;
    }

    public static Double triangle(double k) {
        double halfP = k * 3 / 2;
        return Math.sqrt(halfP * (halfP - k) * (halfP - k) * (halfP - k));
    }

    public static double squareVsTraiange(double p) {
        return square(p) / triangle(p);
    }

    public static double squareVsCircle(double p) {
        return square(p) / circle(p);
    }

    public static double triangleVsCircle(double p) {
        return triangle(p) / circle(p);
    }

}