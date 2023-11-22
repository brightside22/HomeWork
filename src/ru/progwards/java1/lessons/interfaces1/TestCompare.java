package ru.progwards.java1.lessons.interfaces1;
import java.util.Arrays;

public class TestCompare {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        Cow cow = new Cow("Пеструшка", 350.0);
        Cow cow1 = new Cow("Рыжая", 250);

        Duck duck = new Duck("Даша", 3.0);
        Duck duck1 = new Duck("Маша", 3.5);

        Hamster hamster = new Hamster("Акакий", 0.25);
        Hamster hamster1 = new Hamster("Поликарп", 0.32);

        Flower flower = new Flower();

        animals[0] = cow;
        animals[1] = cow1;
        animals[2] = duck;
        animals[3] = duck1;
        animals[4] = hamster;
        animals[5] = hamster1;

        Arrays.sort(animals);
        System.out.println(Arrays.toString(animals));




    }
}
