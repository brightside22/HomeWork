package ru.progwards.java1.lessons.interfaces1;

public class Hamster extends Animal {
    public Hamster(String name,double weight) {
        super(name, weight);
        this.weight = weight;
    }

    @Override
    public Color getColor() {
        return Color.BEIGE;
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