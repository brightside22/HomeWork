package ru.progwards.java1.lessons.arrays1;

import java.util.Arrays;

public class Matrix {
    private int matrix[][];

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int maxInRow(int num) {
        int max = matrix[num][0];
        for (int i = 1; i < matrix[num].length; i++) {
            if (max < matrix[num][i])
                max = matrix[num][i];
        }
        return max;
    }


   /* -9   7  -7
      -4  -2  -2
       3   3   7
      -8   1  -1
    Возвращенo: 0. Ожидалось: -2. */

    public int maxInCol(int num) {
        int max = 0;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i].length > num && matrix[i][num] > max) {
                max = matrix[i][num];
            }
        }
        return max;
    }


    public int max() {
        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                {
                    if (max < matrix[i][j])
                        max = matrix[i][j];
                }
            }
        }
        return max;
    }


    public boolean isMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i].length != matrix[j].length) {
                    return false;
                }
            }
        }
        return true;
    }
    public int maxPlusMin(int[] a) {
        if (a.length != 0 ) {
            Arrays.sort(a);
            int min = a[0];
            int max = 0;
            for (int i = 0; i< a.length; i++ ) {
                if (max < a[i]) {
                    max = a[i];
                }
            }

          if (min == max)
                return min;
            else
                return min + max;
        }
        else
            return 0;
    }
    public int[][] transposition() {
        if (!isMatrix()) {
            return null;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        return matrix;
    }


}