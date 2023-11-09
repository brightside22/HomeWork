package ru.progwards.java1.lessons.classescompare;

import java.util.Objects;

public abstract class Animal {

    private String name;
    private double weight;
    private String kind;


    public Animal(String name) {
        this.name = name;
    }

    public abstract String kind();

    public abstract String say();

    public String toString() {
        return "Это " + kind() + " " + name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int compareTo(Animal animal) {
        return Double.compare(this.weight, animal.weight);
    }


    public  boolean equals(Object o) {
        Animal animal = (Animal) o;
        return Objects.equals(kind, animal.kind) &&
               Objects.equals(name, animal.name) &&
               Objects.equals(weight, animal.weight);
    }

    enum FoodKind {
        HAY,
        CORN,
    }

    abstract public FoodKind getFoodKind();

    abstract public double getFoodCoeff();

    public double calculateFoodWeight() {
        return getWeight() * getFoodCoeff();
    }

    public double calculateFoodPrice() {
        int price = 0;
        if (getFoodKind().compareTo(FoodKind.HAY) == 0)
            return price = 2;
        else if (getFoodKind().compareTo(FoodKind.CORN) == 0)
            return price = 15;

        return calculateFoodWeight() * price;

    }


}