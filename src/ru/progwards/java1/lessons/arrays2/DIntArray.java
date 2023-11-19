package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {

    private int[] a;

    public DIntArray() {
        a = new int[10];
    }

    public void add(int num) {                          //добавляет элемент num в конец массива
        int[] ad = Arrays.copyOf(a, a.length + 1);
        for (int i = 0; i < a.length; i++) {
            ad[i] = a[i];
        }
        ad[ad.length - 1] = num;
        a = ad;
    }


    public void atInsert(int pos, int num) {            //добавляет элемент num в позицию pos

        int[] aa = Arrays.copyOf(a, a.length + 1);
        for (int i = pos; i < aa.length; i++) {
            aa[i] = a[i + 1];
        }
        aa[pos] = num;
        a = aa;
    }


    public void atDelete(int pos) {              //удаляет элемент в позиции pos массива

        int[] aa = new int[a.length - 1];
        for (int i = pos; i < a.length; i++) {
            aa[i] = a[i - 1];
        }
        a = aa;
    }


    public int at(int pos) {
        return a[pos];
    }
}

