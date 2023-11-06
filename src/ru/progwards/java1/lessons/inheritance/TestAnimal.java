package ru.progwards.java1.lessons.inheritance;

    public class TestAnimal {
        public static void printAnimal(Animal animal) {
            System.out.println("Это " + animal.toString() + " " + animal.say());
        }

        public static void main(String args) {
            Animal cow = new Cow("Пеструшка");
            printAnimal(cow);

            cow = new Cow("Рыжая");
            printAnimal(cow);

            Animal duck = new Duck("Даша");
            printAnimal(duck);

            duck = new Duck("Маша");
            printAnimal(duck);


            Animal hamster = new Hamster("Акакий");
            printAnimal(hamster);

            hamster = new Hamster("Поликарп");
            printAnimal(hamster);
        }
    }

