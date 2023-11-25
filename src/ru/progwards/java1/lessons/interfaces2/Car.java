package ru.progwards.java1.lessons.interfaces2;

public class Car implements CompareWeight{
    private double weight;

    public Car (double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public String toString() {
        return "Это автомобиль грузоподъемностью " + getWeight();
    }


    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeight) {
        if (getWeight() < smthHasWeight.getWeight())
            return CompareResult.LESS;
        else if (getWeight() == smthHasWeight.getWeight())
            return CompareResult.EQUAL;
        else
            return CompareResult.GREATER;

    }

    public static void sort(CompareWeight[] a) {

        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {

                CompareResult result = a[i].compareWeight(a[j]);

                if (result == CompareResult.GREATER) {
                    CompareWeight x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }

    }



}
