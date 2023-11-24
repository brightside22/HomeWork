package ru.progwards.java1.lessons.interfaces1;

public class Cow extends Animal {

    @Override
    public Color getColor() {
        return Color.RED;
    }

    public Cow(String name,double weight) {
        super(name, weight);
        this.name = name;
    }

    public Cow(String name) {
        super(name);
        this.name = name;
    }

    public String kind() {
        return "корова";
    }

    public String say() {
        return "мууууууу";
    }

    public FoodKind getFoodKind() {
        return FoodKind.HAY;
    }

    public double getFoodCoeff() {
        return 0.05;
    }

}