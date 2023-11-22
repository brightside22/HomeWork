package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

 class DIntArray {

    private int[] a;

    public DIntArray() {
        a = new int[0];
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


    public void atDelete(int pos) {                    //удаляет элемент в позиции pos массива
        int[] aa = Arrays.copyOf(a, a.length - 1);
        for (int i = pos; i < aa.length; i++) {
            aa[i] = a[i+1];
        }
        a = aa;
    }
    public int at(int pos) { //возврат элемента по позиции
        return a[pos];
    }


    public static void main(String[] args)
    {
        DIntArray d = new DIntArray();
        System.out.println("Before :  " + Arrays.toString(d.a));

        d.add(5);
        d.add(60);
        d.add(8);
        d.add(111);
        d.add(1234);
        System.out.println("added  :  " + Arrays.toString(d.a));

       d.atInsert(2,19);
       System.out.println("inserted:  " + Arrays.toString(d.a));

        d.atDelete(5);
        System.out.println("deleted:  " + Arrays.toString(d.a));

    }
}

