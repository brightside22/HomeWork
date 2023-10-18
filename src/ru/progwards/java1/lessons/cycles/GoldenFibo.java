package ru.progwards.java1.lessons.cycles;


public class GoldenFibo {

    public static int fiboNumber(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int x = 0;
            int y = 1;
            int result = 0;

            for (int i = 2; i <= n; i++) {
                result = x + y;
                x = y;
                y = result;
            }

            return result;
        }
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            double z;

            if (a == b) {
                z = (double) a / c;
            }
            else if (b == c) {
                z = (double) b / a;
            }
            else {
                z = (double) a / b;
            }

            if (z >= 1.61703 && z <= 1.61903) {
                return true;
            }
        }

        return false;
    }



    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            int result = fiboNumber(i);

        }

        for (int i = 1; i <= 15; i++) {
            int base = fiboNumber(i);
            int num1 = fiboNumber(i + 1);
            int num2 = fiboNumber(i + 1);
        }
    }
}