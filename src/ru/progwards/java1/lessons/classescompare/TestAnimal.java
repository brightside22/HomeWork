package ru.progwards.java1.lessons.classescompare;


import ru.progwards.java1.lessons.inheritance.Duck;
import ru.progwards.java1.lessons.inheritance.Hamster;

public class TestAnimal {
    public static void printAnimal(Animal animal) {
        System.out.println(animal.toString() + " - " + animal.say() + "!");
    }

    public static void main(String[] args) {
        System.out.println("Тест для Animal, Cow, Hamster, Duck");
        Cow cow = new Cow("глаша");
        printAnimal(cow);
    }

}