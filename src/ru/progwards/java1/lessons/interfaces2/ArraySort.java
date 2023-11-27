package ru.progwards.java1.lessons.interfaces2;

import java.util.Arrays;

public class ArraySort {
    public static String sort(CompareWeight[] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                CompareWeight.CompareResult result = a[i].compareWeight(a[j]);

                if (result == CompareWeight.CompareResult.GREATER) {
                    CompareWeight x = a[i];
                    CompareWeight y = a[j];
                    a[i] = y;
                    a[j] = x;
                }
            }
        }
        return Arrays.toString(a);
    }


    public static void main(String[] args) {
        CompareWeight[] a = {
                new Cow("Пеструшка", 350),
                new Cow("Рыжая", 250),
                new Car(2000),
                new Duck("Даша", 3),
                new Duck("Маша", 3.5),
                new Hamster("Акакий", 0.25),
                new Hamster("Поликарп", 0.32),
                new Car(1000)
        };
        System.out.println(sort(a));

    }
}