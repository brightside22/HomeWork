package ru.progwards.java1.lessons.inheritance;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String kind();

    public abstract String say();

    @Override
    public String toString() {
        return "Это " + kind() + " " + name;
    }
}