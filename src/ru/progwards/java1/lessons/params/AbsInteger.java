package ru.progwards.java1.lessons.params;

public abstract class AbsInteger {
    public abstract int intValue();

    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        int sum = num1.intValue() + num2.intValue();

        AbsInteger result;

        if (sum >= Byte.MIN_VALUE && sum <= Byte.MAX_VALUE) {
            result = new ByteInteger((byte) sum);
        }

        else if (sum >= Short.MIN_VALUE && sum <= Short.MAX_VALUE) {
            result = new ShortInteger((short) sum);
        }

        else {
            result = new IntInteger(sum);
        }

        return result;
    }


}
