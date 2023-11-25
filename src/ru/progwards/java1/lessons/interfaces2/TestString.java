package ru.progwards.java1.lessons.interfaces2;

public class TestString {

    public static void print(ToString any) {
        System.out.println(any.getString());
    }

    public static void main (String[] args) {
        Cow cow = new Cow("Пеструшка");
        print(cow);
        Duck duck = new Duck("Даша");
        print(duck);
        Hamster hamster = new Hamster("Поликарп");
        print(hamster);
        Time time = new Time(1, 12, 55);
        print(time);
        ComplexNum num = new ComplexNum(22, 5);
        print(num);
    }
}
