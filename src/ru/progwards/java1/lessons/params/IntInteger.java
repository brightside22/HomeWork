package ru.progwards.java1.lessons.params;

public class IntInteger extends AbsInteger{
    private int value;

    int num;
    public IntInteger(int num) {
        this.num = num;
    }

    public String toString(){
        return String.valueOf(num);
    }

    @Override
    public int intValue(){
        value = (int) num;
        return value;
    }

}
