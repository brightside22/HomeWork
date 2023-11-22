package ru.progwards.java1.lessons.interfaces1;

public class Square implements Area {

    private double segment;

    Square(double segment) {
        this.segment = segment;
    }

    public double getArea() {
        return segment * segment;
    }
}