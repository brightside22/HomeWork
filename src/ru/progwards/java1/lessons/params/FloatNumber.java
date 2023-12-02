package ru.progwards.java1.lessons.params;

import java.util.Arrays;

public class FloatNumber {
    public boolean sing;
    public long mantissa;
    public  int exp;
    public String num;

    FloatNumber(boolean sing, long mantissa, int exp) {
        this.sing = sing;
        this.mantissa = mantissa;
        this.exp = exp;
    }
    FloatNumber(String num) {
        String exp1 = "";
        int count = 0;
        int count1 = 0;
        this.num = num;
        char [] num1 =num.toCharArray();

        if (num1[0] == '-') {
            sing = false;
        }

        else {
            sing = true;
        }

        for (int i = 0; num1[i] != '.' || i<=num1.length; i++){
            count++;
        }
        for(int i = 0; num1[i] !='E' || i<num1.length; i++) {
            count1++;
        }

        for (int i = count + 1; i < num1.length; i++) {

        }


            if (count1 > 0) {
            for (int i = count1 + 1; i < num1.length; i++) {
                if (num1[count1+1] == '-') {
                    exp1 += String.valueOf(num1[i+1]);
                }

                else {
                    exp1 = String.valueOf(num1[i]);
                }

            }
        }

        if (num1[count1+1] == '-') {
            exp = -1 * Integer.parseInt(exp1);
        }

        else {
            exp = Integer.parseInt(exp1);
        }


        for(int i = 0; i <= count1; i++) {
            if (num1[i] != '.')
            mantissa += num1[i];
        }

    }

    public String toString(){

        int count = 0;
        String str1 = null;

        char [] str = num.toCharArray();
        str1 = num;



        if (str[0] == '-') {
            sing = false;
            return  "-" + str1 +"E"+exp;
        }

        else {
            sing = true;
            return str1;
        }
    }

    public double toDouble() {
        return Double.parseDouble(num);
    }

    void fromDouble(double num) {
        int count =0;
        if (num < 0)
        {sing = false;}
        else
        {sing = true;}

        String s = Double.toString(num);
        char [] str = s.toCharArray();
        for (int i = 0; i<str.length; i++) {
            if (str[i] == 0) {
                count++;
            }
        }
        exp = count;



    }

    String negative() {
        if (sing == true)
        {sing = false;}
        else
        {sing = true;}

        char [] str = num.toCharArray();
        if (str[0] == '-') {
            for( int i = 0; i<str.length-1; i++){
                str[i] = str[i+1];
            }
        }

        else {
            for (int i = 1; i<str.length; i++) {
                str[i] = str[i-1];
                str[0] = '-';
            }
        }
        return num = String.valueOf(str);
    }


    public FloatNumber add(FloatNumber num) {

        double num1 = this.toDouble();
        double num2 = num.toDouble();
        double sum = num1 + num2;

        FloatNumber result = new FloatNumber(true, 0, 0);
        result.fromDouble(sum);

        return result;
    }


    FloatNumber sub(FloatNumber num){
        double num1 = this.toDouble();
        double num2 = Double.parseDouble(num.negative());
        double sum = num1 + num2;

        FloatNumber result = new FloatNumber(true, 0, 0);
        result.fromDouble(sum);

        return result;
    }

    public static void main(String[] args) {
        FloatNumber num1 = new FloatNumber(true, 1245, 2);
        System.out.println(num1.toString());
        System.out.println();
    }
}
