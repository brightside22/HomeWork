package ru.progwards.java1.lessons.interfaces1;


public class Cow extends Animal {

    public Cow(String name, double weight) {
        super(name, weight);
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