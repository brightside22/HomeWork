package ru.progwards.java1.lessons.inheritance;

public class TestAnimal {
    public static void printAnimal(Animal animal) {
        System.out.println(animal.toString() + " - " + animal.say() + "!");
    }



    public static void main(String[] args) {
        Cow cow = new Cow("Пеструшка");
        printAnimal(cow);

        cow = new Cow("Рыжая");
        printAnimal(cow);

        Duck duck = new Duck("Даша");
        printAnimal(duck);

        duck = new Duck("Маша");
        printAnimal(duck);

        Hamster hamster = new Hamster("Акакий");
        printAnimal(hamster);

        hamster = new Hamster("Поликарп");
        printAnimal(hamster);

    }
}