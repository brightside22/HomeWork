package ru.progwards.java1.lessons.basics;

public class Distance3D {
    public static double distance(double x1, double y1,double z1, double x2, double y2, double z2) {
        double formula = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) + (z1-z2)*(z1-z2));
        return formula;
    }
}
