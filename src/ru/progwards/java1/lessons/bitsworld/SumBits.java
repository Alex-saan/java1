package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static void main(String[] args) {
        byte x = 0b1010101;
        System.out.println(sumBits(x));
    }

    public static int sumBits(byte value) {
        int result = 0;
        for (int i = 0; i < 8; i++) {
            int y = 1 & value;
            value >>= 1;
            result = result + y;
        }
        return result;
    }
}
