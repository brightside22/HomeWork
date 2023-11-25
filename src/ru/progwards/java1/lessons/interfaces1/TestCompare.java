package ru.progwards.java1.lessons.interfaces1;
import java.util.Arrays;

public class TestCompare {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        Cow cow11 = new Cow("Пеструшка", 350.0);
        Cow cow12 = new Cow("Рыжая", 250);

        Duck duck11 = new Duck("Даша", 3.0);
        Duck duck12 = new Duck("Маша", 3.5);

        Hamster hamster11 = new Hamster("Акакий", 0.25);
        Hamster hamster12 = new Hamster("Поликарп", 0.32);

        Flower flower = new Flower();

        animals[0] = cow11;
        animals[1] = cow12;
        animals[2] = duck11;
        animals[3] = duck12;
        animals[4] = hamster11;
        animals[5] = hamster12;

        Arrays.sort(animals);
        System.out.println(Arrays.toString(animals));
        System.out.println(cow11.getWeight());
    }
}
