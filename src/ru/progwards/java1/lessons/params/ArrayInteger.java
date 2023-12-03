package ru.progwards.java1.lessons.params;
import java.util.Arrays;

public class ArrayInteger {
    private byte[] digits;


    ArrayInteger(int n) {
        byte[] digits = new byte [n];
    }

    void fromString(String value) {
        digits = new byte[value.length()];
        for (int i = 0; i < value.length(); i++) {
            digits[i] = Byte.parseByte(String.valueOf(value.charAt(i)));
        }
    }

    public String toString() {
        String numStr = "";
        for(int i =0; i<digits.length; i++) {
            numStr += String.valueOf(digits[i]);
        }
        return numStr;
    }

    public boolean add(ArrayInteger num) {
       byte[] num1 = this.digits;
       byte[] num2 = num.digits;
       int sum = 0;
       byte perepol = 0;

        int leng1 = num1.length;
        int leng2 = num2.length;
        int count = Math.max(leng1, leng2);

        byte[] num3 = new byte[count + 1];


        for (int i = count - 1; i >= 0; i--) {

            if (i < leng1 && i < leng2) {
                sum = num1[i] + num2[i] + perepol;
            }

            else if (i < leng1) {
                sum = num1[i] + perepol;
            }

            else {
                sum = num2[i] + perepol;
            }

            num3[i] = (byte) (sum % 10);
            perepol = (byte) (sum / 10);
        }

        if (perepol != 0) {
            return false;
        }

        else {
            num1 = Arrays.copyOf(num3, count);
            return true;
        }
    }


    public static void main(String[] args) {
        ArrayInteger num1 = new ArrayInteger(7);
        num1.fromString("1140955");
        System.out.println("num1: " + num1.toString());

        ArrayInteger num2 = new ArrayInteger(6);
        num2.fromString("100792");
        System.out.println("num2: " + num2.toString());

        boolean added = num1.add(num2);
        System.out.println("Sum: " + num1.add(num2));

        System.out.println("num1: " + num1.toString());




    }


}
