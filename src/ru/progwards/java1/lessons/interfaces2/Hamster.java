package ru.progwards.java1.lessons.interfaces2;

public class Hamster extends Animal {

    private double weight;

    public Hamster(String name, double weight) {
        super(name, weight);
    }

    public Hamster(double weight) {
        super(weight);
        this.weight = weight;
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

    @Override
    public Color getColor() {
        return Color.BEIGE;
    }

    @Override
    public String getHome() {
        return "поле";
    }



}