package ru.progwards.java1.lessons.wrappers;

public class AccuracyDoubleFloat {
    final static double PI = 3.14;

    public static Double volumeBallDouble(Double radius) {
        return radius = (4 / 3) * PI * radius * radius * radius;
    }

    public static Float volumeBallFloat(Float radius) {
        return radius = (float) ((4 / 3) * PI * radius * radius * radius);
    }

    public static Double calculateAccuracy(Double radius) {
        return volumeBallDouble(radius) - radius.floatValue();
    }
}