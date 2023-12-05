package ru.progwards.java1.lessons.params;
import java.util.Arrays;

public class FloatNumber {
    public boolean sing;
    public long mantissa;
    public int exp;
    public String num;

    FloatNumber(boolean sing, long mantissa, int exp) {
        this.sing = sing;
        this.mantissa = mantissa;
        this.exp = exp;
    }
    public FloatNumber(String num) {
        String exp1 = "";
        int count1 = 0;
        char[] num1 = num.toCharArray();

        if (num1[0] == '-') {
            sing = false;
        } else {
            sing = true;
        }


        for (int i = 0; i < num1.length; i++) {
            if (num1[i] == 'E') {
                count1 = i;
                break;
            }
        }

        for (int i = count1 + 1; i < num1.length; i++) {
            exp1 += num1[i];
        }

        exp = Integer.parseInt(exp1);

        for (int i = 0; i <= count1; i++) {
            if (num1[i] != 'E') {
                mantissa += num1[i];
            }
        }
    }

    public String toString() {
            int count = 0;
            String str1 = "";
            String Smant = String.valueOf(mantissa);

            char[] Cmant = Smant.toCharArray();
            char[] num1 = new char[Smant.length() + 1];

            for (int i = 0; i < Cmant.length; i++) {

                if (!sing) {

                    num1[0] = '-';
                    if (i == 1) {
                        num1[i] = Cmant[i - 1];
                    } else if (i >= 2) {
                        num1[2] = '.';
                        num1[i + 1] = Cmant[i - 1];
                    }

                } else {
                    if (i < 1) {
                        num1[i] = Cmant[i];
                    } else if (i >= 1) {
                        num1[1] = '.';
                        num1[i + 1] = Cmant[i];
                    }
                }
            }

            for (int i = 0; i < num1.length; i++) {
                str1 += num1[i];
            }

            return str1 + "E" + (exp - 1);

    }

    public double toDouble() {
        int count = 0;
        String str1 = "";
        String Smant = String.valueOf(mantissa);

        char[] Cmant = Smant.toCharArray();
        char[] num1 = new char[Smant.length() + 1];

        for (int i = 0; i < Cmant.length; i++) {

            if (!sing) {

                num1[0] = '-';
                if (i == 1) {
                    num1[i] = Cmant[i - 1];
                } else if (i >= 2) {
                    num1[2] = '.';
                    num1[i + 1] = Cmant[i - 1];
                }

            } else {
                if (i < 1) {
                    num1[i] = Cmant[i];
                } else if (i >= 1) {
                    num1[1] = '.';
                    num1[i + 1] = Cmant[i];
                }
            }
        }

        for (int i = 0; i < num1.length; i++) {
            str1 += num1[i];
        }

        String str2 = str1 + "E" + (exp - 1);

        return Double.parseDouble(str2);
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

     void negative() {
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
    }


    public FloatNumber add(FloatNumber num) {
        FloatNumber result = new FloatNumber(true, 0, 0);

        double tDouble = this.toDouble();
        double nDouble = num.toDouble();
        double sum = tDouble + nDouble;

        result.fromDouble(sum);
        return result;
    }


    FloatNumber sub(FloatNumber num){
         num.negative();
         return this.add(num);
    }

    public static void main(String[] args) {
       FloatNumber num = new FloatNumber (true, 12001, 4);
        FloatNumber num2 = new FloatNumber (true, 12004, 3);

       System.out.println(num.toString());
       System.out.println(num.toDouble());
        System.out.println(num.add(num2));



    }



}
