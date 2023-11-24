package ru.progwards.java1.lessons.interfaces1;

public abstract class Animal implements IColor, Comparable<Animal> {
    private String name;
    private double weight;
    private String kind;
    private Color color;


    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract String kind();

    public abstract String say();

    public String toString() {
        return "Это " + kind() + " " + name + " " + weight + " " + getColor();
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


    public boolean equals(Object o) {
        this.kind = kind();
        this.name = name;
        int compare = Double.compare(this.weight, weight);


        if (name.equals(kind.equals(name)) == kind.equals(kind()))
            return true;
        else
            return false;
    }


    public enum FoodKind {
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
        if (getFoodKind().compareTo(FoodKind.HAY) == 0) {
            return price = 2;
        } else if (getFoodKind().compareTo(FoodKind.CORN) == 0) {
            return price = 15;
        }
        return calculateFoodWeight() * price;
    }

    @Override
    public Color getColor(){
        return color;
    }



    class Gun {
        String model;
        double caliber;

        public Gun(String model, double caliber) {
            this.model = model;
            this.caliber = caliber;
        }

        int compareTo(Gun gun) {
            return Double.compare(caliber, gun.caliber);
        }
    }
    public interface Comparable<T> {
        public int compareTo(T o);
    }

    public class Num implements Comparable<Num>{
        public  int num;

        Num(int num){
            this.num = num;
        }
        public int compareTo(Num o) {
            return Integer.compare(o.num, num);
        }
    }








    public interface Temperature {
        public double getTemperature();
    }

    abstract public static class Body implements Temperature {
    }

    public static class Man extends Body {
        @Override
        public double getTemperature() {
            return 36.6;
        }
    }

    public static class Sun extends Body {
        @Override
        public double getTemperature() {
            return 5500;
        }
    }

    static Temperature maxTemperature(Body b1, Body b2) {
        if (b1.getTemperature() > b2.getTemperature())
            return b1;
        else
            return b2;
    }
}



