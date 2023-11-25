package ru.progwards.java1.lessons.interfaces2;

public class Duck extends Animal {
    public Duck(String name, double weight) {
        super(name, weight);
        this.weight = weight;
    }

    public Duck(String name) {
        super(name);
        this.name = name;
    }

    public Duck(double weight) {
        super(weight);
        this.weight = weight;
    }

    public String kind() {
        return "утка";
    }
    public String say() {
        return "кря-кря";
    }


    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    public double getFoodCoeff() {
        return 0.04;
    }
    @Override
    public Color getColor() {
        return Color.GRAY;
    }
    public  String getHome() {
        return "ферма";
    }


}
