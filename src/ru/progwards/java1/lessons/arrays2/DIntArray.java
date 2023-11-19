package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {

    private int[] a;

    public DIntArray() {
        a = new int[1];
    }

    public void add(int num) {               //добавляет элемент num в конец массива
        int[] aa = Arrays.copyOf(a, a.length + 1);
        aa[a.length] = num;
        a = aa;
    }

    public void atInsert(int pos, int num) {            //добавляет элемент num в позицию pos
        int[] aa = Arrays.copyOf(a, a.length + 1);
        for (int i = pos; i < a.length; i++) {
            aa[i+1] = a[i];
        }
        aa[pos] = num;
        a = aa;
    }


    public void atDelete(int pos) {              //удаляет элемент в позиции pos массива
        int[] aa = new int[a.length - 2];
                                                     //   -50,-88,-50,-35,-79,59,91,20.     0
        for (int i = 0; i < aa.length; i++) {
            if (i >= pos) {
                aa[i] = a[i+1];
            } else { aa[i] = a[i]; }
        }
        a = aa;
    }



    public int at(int pos) { //возврат элемента по позиции
        return a[pos];
    }
}

