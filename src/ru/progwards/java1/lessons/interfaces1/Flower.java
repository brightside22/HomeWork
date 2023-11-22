package ru.progwards.java1.lessons.interfaces1;

public class Flower implements IColor{
    private String color;
    @Override
    public Color getColor(Animal animal) {
       Color color = Color.WHITE;
        return color;
    }
}
