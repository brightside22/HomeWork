package ru.progwards.java1.lessons.params;
import java.util.Arrays;
public class ArrayInteger {
    private byte[] digits;


    ArrayInteger(int n) {
        digits = new byte[n];
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
       int count = 0;
       int count1 = 0;

       for(int i = 0; i<=num1.length; i++) {
           count++;
       }

       for(int i = 0; i<=num2.length; i++) {
           count1++;
       }

       if (count1 >= count){
            for (int i = count; i<count; i--){

            }
        }

       else {
           for (int i = count1; i>=count1; i--) {

           }
       }

        if () {

            return false;
        }
    }



}
