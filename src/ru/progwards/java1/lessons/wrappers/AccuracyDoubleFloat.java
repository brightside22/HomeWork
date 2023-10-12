package ru.progwards.java1.lessons.wrappers;

public class AccuracyDoubleFloat {
    final static double PI = 3.14;
    final static double R = 6371.2;

    public static Double volumeBallDouble(Double radius) {
        return radius = (4 / 3) * PI * radius;
    }

    public static Float volumeBallFloat(Float radius) {
        return radius = (float) ((4 / 3) * PI * radius);
    }

    public static Double calculateAccuracy(Double radius) {
        return volumeBallDouble(radius) - radius.floatValue();
    }
}