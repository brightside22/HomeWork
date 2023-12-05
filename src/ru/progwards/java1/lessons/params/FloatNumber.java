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

        String mant = "";

        for (int i = 0; i <= count1; i++) {
            if (num1[i] != 'E' & num1[i] != '.') {
                mant += num1[i];
            }
        }
        mantissa = Long.valueOf(mant);
    }

    public String toString() {
            int count = 0;
            int exp1 = exp;
            long m = this.mantissa;
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
         sing = !sing;
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
       FloatNumber num3 = new FloatNumber ("4.767E2");


       System.out.println(num3.toString());
       System.out.println(num3.toDouble());




    }



}
