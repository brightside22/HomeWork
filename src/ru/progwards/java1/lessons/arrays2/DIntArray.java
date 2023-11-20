package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {

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
                aa[i] = a[i + 1];
            }
            a = aa;

    }


    public interface Speaking {
        public String say();
    }

    public class Dog implements Speaking {
        public String say() {
            return "Гав";
        }
    }

    public class Goat implements Speaking {
        public String say() {
            return "Мее";
        }
    }

    public interface Comparable<T> {
        public int compareTo(T o);
    }

    public class Num implements Comparable<Num> {
        public int num;
        Num(int num) {
            this.num = num;
        }

        @Override
        public int compareTo(Num o) {
            return Integer.compare(num, o.num);
        }
    }
  




    public int at(int pos) { //возврат элемента по позиции
        return a[pos];
    }
}

