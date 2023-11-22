package ru.progwards.java1.lessons.interfaces1;


public class Hamster extends Animal {
    public Hamster(String name, double weight) {
        super(name, weight);
    }

    public String kind() {
        return "хомяк";
    }

    public String say() {
        return "хрум-хрум-хрум";
    }
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    public double getFoodCoeff() {
        return 0.06;
    }


}