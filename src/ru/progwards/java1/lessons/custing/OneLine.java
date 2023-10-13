package ru.progwards.java1.lessons.custing;

public class OneLine {


    private static String str;

    public static String strValue(String value) {
        return str = "Передана строка со значением  " + "\"" + value + "\"";
    }


    public static String intValue(String variable,  int value) {
        return str = "Значение " + variable + " равно " + value;
    }


    public static String square(int n) {
        return str = "Число " + n + " в квадрате равно " + n*n;
    }


    public static String sum(int n, int m) {
        return str = "Сумма " + n + " и " + m + " равна " + (n+m);
    }

    public static void main(String[] args) {
        System.out.println(strValue("Однажды, в студеную зимнюю пору"));
    }

}
