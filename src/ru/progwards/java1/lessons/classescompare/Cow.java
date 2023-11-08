package ru.progwards.java1.lessons.classescompare;


import ru.progwards.java1.lessons.inheritance.Animal;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
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