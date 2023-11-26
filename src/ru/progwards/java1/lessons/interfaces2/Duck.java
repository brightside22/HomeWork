package ru.progwards.java1.lessons.interfaces2;

public class Duck extends Animal  {
     private  double weight;

    public Duck(String name,double weight) {
        super(name, weight);
        this.name = name;
        this.weight = weight;
    }



    public Duck(String name) {
        super(name);
        this.name = name;
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


    public interface Fruit {
        public double getWeight();
    }

    public static double sumFuits(Fruit []box) {
        double a = 0;
        for (int i = 0; i<box.length; i++) {
            a += box[i].getWeight();
        }
        return a;
    }



}
