package ru.progwards.java1.lessons.classescompare;

import ru.progwards.java1.lessons.inheritance.Animal;
import ru.progwards.java1.lessons.inheritance.Cow;
import ru.progwards.java1.lessons.inheritance.Duck;
import ru.progwards.java1.lessons.inheritance.Hamster;

public class TestAnimal {
    public static void printAnimal(Animal animal) {
        System.out.println(animal.toString() + " - " + animal.say() + "!");
    }

    public static void main(String[] args) {
        ru.progwards.java1.lessons.inheritance.Cow cow = new ru.progwards.java1.lessons.inheritance.Cow("Пеструшка");
        printAnimal(cow);

        cow = new Cow("Рыжая");
        printAnimal(cow);

        ru.progwards.java1.lessons.inheritance.Duck duck = new ru.progwards.java1.lessons.inheritance.Duck("Даша");
        printAnimal(duck);

        duck = new Duck("Маша");
        printAnimal(duck);

        ru.progwards.java1.lessons.inheritance.Hamster hamster = new ru.progwards.java1.lessons.inheritance.Hamster("Акакий");
        printAnimal(hamster);

        hamster = new Hamster("Поликарп");
        printAnimal(hamster);

    }
}