package ru.progwards.java1.lessons.wrappers;

public class AccuracyDoubleFloat {
    final static double PI = 3.14;

    public static Double volumeBallDouble(Double radius) {

        return radius = ((4 * PI * radius * radius * radius)/3);
    }

    public static Float volumeBallFloat(Float radius) {
        return radius = (float) ((4 * PI * radius * radius * radius)/3);
    }

    public static Double calculateAccuracy(Double radius) {
        return radius = volumeBallDouble(radius) - volumeBallFloat(radius.floatValue());
    }

}