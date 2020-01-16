package ru.progwards.java1.lessons.bitsworld;


public class CheckBit {
    public static void main(String[] args) {
        checkBit((byte) 0b01010101, 0);
    }

    public static int checkBit(byte value, int bitNumber) {
        int y = 0;
        for (int i = 0; i <= bitNumber; i++) {
            y = 1 & value;
            value >>= 1;
        }
        return y;
    }
}

