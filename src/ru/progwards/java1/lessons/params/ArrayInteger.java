package ru.progwards.java1.lessons.params;
import java.util.Arrays;

public class ArrayInteger {
    private byte[] digits;


    ArrayInteger(int n) {
        digits = new byte[n];
    }

    void fromString(String value) {
        String StrValue =String.valueOf(value);
        digits = new byte[StrValue.length()];
        for (int i = 0; i < value.length(); i++) {
            digits[i] = Byte.parseByte(String.valueOf(i));
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
        int perepol = 0;

        int leng1 = num1.length;
        int leng2 = num2.length;
        int count = Math.max(leng1, leng2);


        if (count == leng1) {
            byte[] num4 = new byte[num1.length];
            int z = num1.length - num2.length;

            for (int i = z; i < num4.length; i++) {
                num4[i] = num2[i - z];
            }
            num2 = num4;
        }


        if (count == leng2) {
            this.digits = new byte[]{0};
            return false;
        }


        byte[] num3 = new byte[count + 1];



        for (int i = count - 1; i >= 0; i--) {
            sum = num1[i] + num2[i] + perepol;
            num3[i] = (byte) (sum % 10);

            perepol = sum / 10;
        }


        if (perepol != 0) {
            this.digits = new byte[]{0};
            return false;
        } else {
            this.digits = new byte[count];
            for (int i = 0; i < count; i++) {
                this.digits[i] = num3[i];
            }
            return true;
        }
    }


        public static void main(String[] args) {
        ArrayInteger num1 = new ArrayInteger(7);
        num1.fromString("14463774");
        System.out.println("num1: " + num1.toString());

        ArrayInteger num2 = new ArrayInteger(6);
        num2.fromString("83345");
        System.out.println("num2: " + num2.toString());

        boolean added = num1.add(num2);
        System.out.println("Sum: " + num1.add(num2));
        System.out.println("num1: " + num1.toString());





    }


}