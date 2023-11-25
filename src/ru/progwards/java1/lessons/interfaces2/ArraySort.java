package ru.progwards.java1.lessons.interfaces2;

public class ArraySort {
    public static void sort(CompareWeight[] a) {

        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {

                CompareWeight.CompareResult result = a[i].compareWeight(a[j]);

                if (result == CompareWeight.CompareResult.GREATER) {
                    CompareWeight x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }

    }
}