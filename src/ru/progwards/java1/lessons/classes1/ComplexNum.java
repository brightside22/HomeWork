package ru.progwards.java1.lessons.classes1;

public class ComplexNum {

    int a;
    int b;
    double i = Math.sqrt(-1);

    public ComplexNum(int a, int b) {
        this.a=a;
        this.b=b;
        //int Complex = (int) (a + b * Math.sqrt(-1));
    }


    public String toString() {
        return this.a + "+" + this.b + "i";
    }


    public ComplexNum add(ComplexNum num) {
        int newA = this.a + num.a;
        int newB = this.b + num.b;

        return new ComplexNum(newA, newB );
    }

    public ComplexNum sub(ComplexNum num) {
        int newA = this.a - num.a;
        int newB = this.b - num.b;

        return new ComplexNum(newA, newB );
    }

    public ComplexNum mul(ComplexNum num) {
        int newA = this.a * num.a;
        int newB = this.b * num.b;

        return new ComplexNum(newA, newB );
    }

    public ComplexNum div(ComplexNum num) {
        // this.a = a num.a = c this.b= b num.b= d
        // ((b*c - a*d)/(c*c+d*d))i
        int newA = (this.a * num.a + this.b * num.b)/(num.a*num.a + num.b*num.b);
        int newB = (this.b*num.a - this.a*num.b)/(num.a*num.a + num.b*num.b);
        return new ComplexNum(newA, newB );
    }
}
