package ru.progwards.java1.lessons.arrays1;

public class ArraySort {
    public static void sort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            for(int j = 1; j < a.length; j++) {
            if (a[i] > a[i+j]) {
                int x1 = a[i];
                int x2 = a[i + j];
                a[i + j] = x1;
                a[i] = x2;
                }
            }
        }
    }
}
