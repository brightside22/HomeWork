package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class IntArrays {
    public static String toString(int []a) {
        String str = String.valueOf(a[0]);
        for (int i = 1; i < a.length; i++) {
            if ((a[i]) != a[0]) {
                str += ", " + String.valueOf(a[i]);
            }
        }
        return "[" + str + "]";
    }



    public static boolean equals1(int[] a1, int[] a2){
        int base1;
        int base2;
        boolean trfl = false;

        if (a1.length != a2.length) {
             trfl = false;
        }
        else {
            for (int i = 1; i < a1.length; i++) {          //сортировка массива циклом
                if (a1[i - 1] > a1[i]) {
                    base1 = a1[i];
                    a1[i] = a1[i - 1];
                    a1[i - 1] = base1;
                }
            }

            for (int j = 1; j < a1.length; j++) {         //сортировка массива циклом
                if (a2[j - 1] > a2[j]) {
                    base2 = a2[j];
                    a2[j] = a2[j - 1];
                    a2[j - 1] = base2;
                }
            }

            for (int ij = 0; ij < a1.length; ij++) {
                if (a2[ij] == a1[ij]) {
                    trfl = true;
                    break;
                } else {
                    trfl = false; }
                break;

            }
        }

        return trfl;
    }


    public static boolean equals2(int[] a1, int[] a2) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }



    public static void main(String[] args) {
        int[] a =  {-12, 39, 45, -83, 85};
        System.out.println(toString(a));
        int[] a11 =  {-17, 51, 14, 2, 90, -47, 1, 28} ;
        System.out.println(toString(a11));


        int[] a1 = {-100, -37, -34, -21, 16, 30, 31, 47, 81, 96} ;
        int[] a2 = {-37, -1, -34, -21, 16, 30, 31, 47, 81, 96} ;
        System.out.println(equals1(a1, a2));
        System.out.println(equals2(a1, a2));

    }




}
