package ru.progwards.java1.lessons.params;

public class ShortInteger extends AbsInteger{
    private int value;

    short num;
    public ShortInteger (short num) {
        this.num =num;
    }

    public String toString(){
        return String.valueOf(num);
    }

    @Override
    public int intValue(){
        return value;
    }



}
