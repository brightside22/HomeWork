package ru.progwards.java1.lessons.params;

public class ByteInteger extends AbsInteger{
    private int value;

    byte num;
    public ByteInteger(byte num) {
        this.num = num;
    }

    public String toString(){
        return String.valueOf(num);
    }

    @Override
    public int intValue(){
        return value;
    }


}
