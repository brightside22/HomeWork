package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {

    private int[] a;

    public DIntArray() {
        a = new int[0];
    }

    public void add(int num) {
        int[] newArray = new int[a.length + 1];
        System.arraycopy(a, 0, newArray, 0, a.length);
        newArray[a.length] = num;
        a = newArray;
    }



    public void atInsert(int pos, int num) {

        int[] aa = new int[a.length + 1];
        System.arraycopy(a, 0, aa, 0, pos);
        aa[pos] = num;
        System.arraycopy(a, pos, aa, pos + 1, a.length - pos);
        a = aa;
    }


    public void atDelete(int pos) {

        int[] aa = new int[a.length - 1];
        System.arraycopy(a, 0, aa, 0, pos);
        System.arraycopy(a, pos + 1, aa, pos, a.length - pos - 1);
        a = aa;
    }


    public int at(int pos) {                 //- возвращает элемент по индексу pos
        Arrays.sort(a);
        return Arrays.binarySearch(a, pos);
    }



}

