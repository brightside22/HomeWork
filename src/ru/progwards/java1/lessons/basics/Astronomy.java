package ru.progwards.java1.lessons.basics;

public class Astronomy {
    final static double pi = 3.14;

    public static Double sphereSquare(Double r) {
        double S = 4 * pi * (r*r);
        return S;
    }

    public static Double earthSquare() {
        return sphereSquare(6371.2 );
    }

    public static Double mercurySquare() {
        return sphereSquare(2439.7);
    }

    public static Double jupiterSquare() {
        return sphereSquare(71492.0);
    }

    public static Double earthVsMercury(){
        double s = earthSquare() / mercurySquare();
        return s;
    }

    public static Double earthVsJupiter() {
        double s = earthSquare() / jupiterSquare();
        return s;
    }


}

