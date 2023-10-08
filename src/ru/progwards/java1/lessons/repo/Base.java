package ru.progwards.java1.lessons.repo;

public class Base {
    //1
    static String  X_EQUALS ="x = ";
    static String Y_EQUALS = "y = ";
    static String A_EQUALS = "a = ";
    static String B_EQUALS = "b = ";

    static  String C_EQUALS = "c = ";



    // 2.1
    public static int subtraction(int x, int y) {
        System.out.println("Вызвана функция subtraction() с параметрами " + X_EQUALS + x + ", " + Y_EQUALS + y);
        return x - y;

    }


    // 2.2
    public static int addition(int x, int y){
        System.out.println("Вызвана функция addition() с параметрами " + X_EQUALS + x + ", " + Y_EQUALS + y);
        return x + y;
    }


    // 2.3
    public static int multiplication(int x, int y) {
        System.out.println("Вызвана функция multiplication() с параметрами " + X_EQUALS + x + ", " + Y_EQUALS + y);
        return x * y;
    }


    //2.4
    public static void calculation() {
        int a = 34;
        int b = 55;
        System.out.println(A_EQUALS + a);
        System.out.println(B_EQUALS + b);
        int c = addition(a, b);
        System.out.println("a + b = " + c);
        c = subtraction(a, b);
        System.out.println("a - b = " + c);
        c = multiplication(a, b);
        System.out.println("a * b = " + c);
    }


    //2.5
    public static void calculation(int a, int b, int c)  {
        System.out.println("Вызвана функция calculation() с параметрами " + A_EQUALS + a + ", " + B_EQUALS + b + ", " + C_EQUALS + c);
        System.out.println("a + b + c = " + addition(addition(a, b), c));
        System.out.println("a^3 = "  + multiplication(a, multiplication(a, a)));
        System.out.println("a - (b + c^2) = " + subtraction(a, addition(b, multiplication(c, c))));
    }


    //3
    public static void main(String[] args) {
        subtraction(45, 12);
        subtraction(23, 55);
        addition(128, 787);
        addition(528, 387);
        multiplication(124, 87);
        multiplication(1528, 3);
        calculation();
        calculation(11, 25, 410);
        calculation(100, 9 , 98);

    }
}
