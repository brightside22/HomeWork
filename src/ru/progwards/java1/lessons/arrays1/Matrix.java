package ru.progwards.java1.lessons.arrays1;

public class Matrix {
    private int matrix[][];

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int maxInRow(int num) {
        int min = 0;
        for (int i = 0; i < matrix[num].length; i++) {
            if (min < matrix[num][i])
                min = matrix[num][i];
        }
        return min;
    }

    public int maxInCol(int num) {
        int n = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix!= null) {
                if (matrix[i][num] > matrix[i + 1][num]) {
                    n = matrix[i][num];
                } else if (matrix[i][num] < matrix[i + 1][num]) {
                    n = matrix[i][num];
                }
            }
        }
        return n;
    }

    public int max() {
        int min = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                {
                    if (min < matrix[i][j])
                        min = matrix[i][j];
                }
            }
        }
        return min;
    }
/*      -4  -8   5
        -4  -4  -8
         7  -4   0
         6   3   8
    Возвращенo: 12. Ожидалось: 8. */

    public boolean isMatrix() {
        int counter = 0;
        int counter1 = 0;
        boolean t = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                counter += 1;
            }
        for (int j = 1; j < matrix[i].length; i++) {
                counter += 1;
            }
        if (counter1 == counter){
            t = true;
        }
        else
            t = false;
        }
        return t;
    }
    public int[][] transposition() {
        if (isMatrix() != true)
            return null;

        int a = 0;
        int b = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                a = matrix[i][j];
                b = matrix[i+1][j];
                matrix[i+1][j] = a;
                matrix[i][j]=b;

            }
        }
        return matrix;
    }

 }