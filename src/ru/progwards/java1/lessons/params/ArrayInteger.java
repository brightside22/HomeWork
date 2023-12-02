package ru.progwards.java1.lessons.params;
import java.util.Arrays;

public class ArrayInteger {
    private byte[] digits;


    ArrayInteger(int n) {
     String n1 = String.valueOf(n);
     char [] nChar = n1.toCharArray();
    }

    void fromString(String value) {
        digits = new byte[Integer.parseInt(value)];
    }

    public String toString() {
        String numStr = null;
        for(int i =0; i<digits.length;i++) {
            numStr += String.valueOf(digits[i]);
        }
        return numStr;
    }

    public boolean add(ArrayInteger num) {
       byte[] num1 = this.digits;
       byte[] num2 = num.digits;
       byte[] num3 = {};
       byte sum = 0;
       byte perepol = 0;

        int len1 = num1.length;
        int len2 = num2.length;
        int count = Math.max(len1, len2);

       if (count >= count){
            for (int i = count; i<count; i--){
                sum = (byte) (num1[i] + num2[i]);
                    num3[i-1] += sum %10;
                    perepol = (byte) (sum/10);
            }
        }

        if (perepol != 0) {
            return false;
        }

        this.digits = Arrays.copyOf(num3, count);
        return true;
    }


    public static void main(String[] args) {
        ArrayInteger num1 = new ArrayInteger(5);
        num1.fromString("12345");
        System.out.println("num1: " + num1.toString());

        ArrayInteger num2 = new ArrayInteger(5);
        num2.fromString("98765");
        System.out.println("num2: " + num2.toString());

        boolean added = num1.add(num2);
        if (added) {
            System.out.println("Sum: " + num1.toString());
        } else {
            System.out.println("Overflow! Result reset to 0.");
            System.out.println("Sum: " + num1.toString());
        }
    }


}
