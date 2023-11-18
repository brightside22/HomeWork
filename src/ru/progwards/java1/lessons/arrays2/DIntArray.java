package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {

    private int[] a;

    public DIntArray() {
    }

    public void add(int num) {
        int[] ad = Arrays.copyOf(a, a.length + 1);
        for (int i = 0; i < a.length; i++) {
            ad[i] = a[i];
            ad[i + 1] = num;
        }
    }


    public void atInsert(int pos, int num) {
        Arrays.copyOf(a, a.length + 1);
        for (int i = pos; i <= a.length; i++) {
            a[i] = a[i + 1];
            a[pos] = num;
        }
    }


    public void atDelete(int pos) {
        Arrays.copyOf(a, a.length - 1);
        for (int i = pos; i < a.length; i++) {
            a[i] = a[i - 1];
        }
    }


    public int at(int pos) {                 //- возвращает элемент по индексу pos
        Arrays.sort(a);
        return Arrays.binarySearch(a, pos);
    }


    public void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
    }
}

