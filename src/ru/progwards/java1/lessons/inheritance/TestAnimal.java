package ru.progwards.java1.lessons.inheritance;

public class TestAnimal {
        public static void printAnimal(Animal animal) {
            System.out.println("Это " + animal.name + " " + animal.toString());
    }


    public void main(String[] args) {
        Animal cow = new Animal("Пеструшка");
        printAnimal(cow);
        Animal horse = new Animal("Рыжая");
        printAnimal(horse);
        Animal duck = new Animal("Даша");
        printAnimal(duck);
        Animal goat = new Animal("Маша");
        printAnimal(goat);
        Animal hamster = new Animal("Акакий");
        printAnimal(hamster);
        Animal rabbit = new Animal("Поликарп");
        printAnimal(rabbit);

    }
}
