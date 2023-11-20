package ru.progwards.java1.lessons.interfaces1;

public abstract class Circle implements Area {

    private  double diameter;

    Circle(double diameter){
        this.diameter = diameter;
    }

    public double getArea() {
        return Math.PI*diameter*diameter;
    }
}