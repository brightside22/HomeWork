package ru.progwards.java1.lessons.wrappers;

public class StringConverter {
    public static String fromByte(byte number) {
        String num = Integer.toString(number);
                return num;
    }

    public static String fromShort(short number) {
        String num1 = String.valueOf(number);
        return num1;
    }

    public static String fromInt(int number) {
        String num2 = String.valueOf(number);
        return num2;
    }

    public static String fromLong(long number) {
        String num3 = String.valueOf(number);
        return num3;
    }

    public static String fromFloat(float number) {
        String num4 = String.valueOf(number);
        return num4;
    }

    public static String fromDouble(double number) {
        String num5 = String.valueOf(number);
        return num5;
    }
}
