package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class IntArrays {
    public static String toString(int []a) {
        String str = String.valueOf(a[0]);
        for (int i = 0; i < a.length; i++) {
            if ((a[i]) != 1) {
                str += ", " + String.valueOf(a[i]);
            }
        }
        return "[" + str + "]";
    }


    public static boolean equals1(int[] a1, int[] a2){
        int base1;
        int base2;
        boolean trfl = false;

        if (a1.length != a2.length)
            return false;

        else if( a1.length == a2.length)
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
                if (a1[ij] == a2[ij])
                    trfl = true;
                else
                    trfl = false;
            }


            return trfl;
    }


    public static boolean equals2(int[] a1, int[] a2) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }



    public static void main(String[] args) {
        int[] aa =  {1, 2, 3, 4, 5} ;
        System.out.println(toString(aa));

        int[] a =  {1, 2, 3, 4, 45, 4,6, 5, 5} ;
        System.out.println(toString(a));


        int[] a1 = {1, 2, 3, 5, 4} ;
        int[] a2 = {1, 3, 2, 4, 5} ;
        System.out.println(equals1(a1, a2));
        System.out.println(equals2(a1, a2));

    }




}
