package ru.progwards.java1.lessons.interfaces1;


public class Rectangle implements Area{
    private double length;
    private double width;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }

}
