package ru.progwards.java1.lessons.interfaces2;

 interface CompareWeight {
    public enum CompareResult {
        LESS,
        EQUAL,
        GREATER,
    }

    public CompareResult compareWeight(CompareWeight smthHasWeight);

    public double getWeight();



}
