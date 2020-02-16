package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;
import java.util.Arrays;

public class ArrayInteger {
    byte[] digits;

    ArrayInteger(int n) {
        digits = new byte[n];
    }

    void fromInt(BigInteger value) {
        int v = value.toString().length();
        if (value.toString().length() > digits.length) {
            digits = new byte[value.toString().length()];

        }
        for (int i = 0; i < v; i++) {
            digits[i] = value.mod(BigInteger.TEN).byteValue();
            value = value.divide(BigInteger.TEN);
        }
    }

    BigInteger toInt() {
        String str = "";
        for (int i = 0; i < this.digits.length; i++)
            str = digits[i] + str;
        return new BigInteger(str);
    }

    //сложить 2 числа, не используя BigInteger, а  используя массив digits, результат поместить в экземпляр ArrayInteger,
// у которого был вызван метод. При переполнении вернуть false, при этом само число сбросить в 0
    boolean add(ArrayInteger num) {
        if (this.digits.length < num.digits.length) {
            Arrays.fill(this.digits, (byte) 0);
            return false;
        }
        byte y = 0;
        byte x;
        for (int i = 0; i < this.digits.length; i++) {
            if (i < num.digits.length) {
                x = (byte) (((this.digits[i] + num.digits[i] + y) % 10));
                y = (byte) ((this.digits[i] + num.digits[i] + y) / 10);
//                y = (byte) (x / 10);
                this.digits[i] = x;
            } else {
                if (y > 0) {
                    x = (byte) ((this.digits[i] + y) % 10);
                    y = (byte) ((this.digits[i] + y) / 10);
                    this.digits[i] = x;
                    System.out.println(y);
                }
            }
        }
        if (y > 0) {
            Arrays.fill(this.digits, (byte) 0);
            return false;
        }
        System.out.println(Arrays.toString(digits));
        return true;
    }

    public static void main(String[] args) {
        ArrayInteger dig = new ArrayInteger(7);
        dig.fromInt(new BigInteger("9999999")); //4702189
        ArrayInteger dig1 = new ArrayInteger(6);
        dig1.fromInt(new BigInteger("999999"));
        System.out.println(dig.add(dig1));
        System.out.println(dig.toInt());
    }
}

    /*public static int[] digit(int number) {
        int i = 0;
        int x;
        int y = number;
        do {
            i++;
        }
        while (((number /= 10) != 0));
        int[] digits = new int[i];
        for (int j = 0; j < digits.length; j++) {
            x = y % 10;
            y /= 10;
            digits[j] = x;
        }
        return digits;
    }*/