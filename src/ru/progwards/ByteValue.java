package ru.progwards;

public class ByteValue {
    public static void main(String[] args) {
        byte value = 0b01100000;
        int result = 1 & value;
        System.out.println(Integer.toBinaryString(result));

    }
}
