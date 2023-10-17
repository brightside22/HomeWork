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
        if (a == b && b == c && c == a) {
            double z = (double) a / c;

            if (z >= 1.61703 && z <= 1.61903) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Первые 15 чисел Фибоначчи:");
        for (int i = 1; i <= 15; i++) {
            int result = fiboNumber(i);
            System.out.print(result + " ");
        }
        System.out.println();

        System.out.println("Золотые треугольники:");
        for (int i = 1; i <= 15; i++) {
            int base = fiboNumber(i);
            int num1 = fiboNumber(i + 1);
            int num2 = fiboNumber(i + 1);

            if (base <= 100 && num1 <= 100 && num2 <= 100 && isGoldenTriangle(base, num1, num2)) {
                System.out.println("Основание: " + base + ", Ребро 1: " + num1 + ", Ребро 2: " + num2);
            }
        }
    }
}
