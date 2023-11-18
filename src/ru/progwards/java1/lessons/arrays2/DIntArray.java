package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {
    private int[] a;

    public DIntArray() {
    }

    public void add(int num) {
        for(int i = a.length;  i <= a.length; i++) {
            Arrays.copyOf(a, a.length+1);
            a[i+1] = num;
        }
    }



    public void atInsert(int pos, int num) {
        Arrays.copyOf(a, a.length+1);
        for (int i = pos; i <= a.length; i++) {
            a[i] = a[i+1];
            a[pos] = num;
        }
    }


    public void atDelete(int pos) {
        Arrays.copyOf(a, a.length-1);
        for (int i = pos; i < a.length; i++) {
            a[i] =  a[i-1];
        }
    }


    public int at(int pos)  {                 //- возвращает элемент по индексу pos
        Arrays.sort(a);
        return Arrays.binarySearch(a, pos);
    }

}
