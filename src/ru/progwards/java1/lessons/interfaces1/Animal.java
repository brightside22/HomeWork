package ru.progwards.java1.lessons.interfaces1;

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
}

    public interface IColor {
        enum Color {
            GRAY,
            WHITE,
            RED,
            BEIGE,
        }
        public void Enum<IColor.Color> getColor(){
            Color color = null;

            if (Animal.kind() == Cow){
                color = Color.RED;
            } else if (Animal == Duck){
                color = Color.GRAY;
            } else if  (Animal == Hamster) {
                color = Color.BEIGE;
            } return color;
        }

    }




