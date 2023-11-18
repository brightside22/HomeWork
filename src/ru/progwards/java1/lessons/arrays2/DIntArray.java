package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {

    private int[] a;

    public DIntArray() {
        this.a = new int [0];
    }
    public void add(int num) {
        int[] ad = Arrays.copyOf(a, a.length + 1);
        for (int i = 0; i < a.length; i++) {
            ad[i] = a[i];
        }
        ad[a.length] = num;
        a = ad;
    }



    public void atInsert(int pos, int num) {

        int[] aa = Arrays.copyOf(a, a.length + 1);

        for (int i = aa.length - 1; i > pos; i--) {
            aa[i] = aa[i - 1];
        }

        aa[pos] = num;
        a = aa;
    }


    public void atDelete(int pos) {

        int[] aa = new int[a.length - 1];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i != pos) {
                aa[j++] = a[i];
            }
        }
        a = aa;
    }


    public int at(int pos) {                 //- возвращает элемент по индексу pos
        Arrays.sort(a);
        return Arrays.binarySearch(a, pos);
    }



}

