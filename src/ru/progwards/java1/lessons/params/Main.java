package ru.progwards.java1.lessons.params;

public class Main {
    public static void main(String[] args) {
        AbsInteger num1 = new ByteInteger((byte) 27);
        AbsInteger num2 = new ByteInteger((byte) 27);

        AbsInteger result = AbsInteger.add(num1, num2);

        System.out.println(result);
    }
}