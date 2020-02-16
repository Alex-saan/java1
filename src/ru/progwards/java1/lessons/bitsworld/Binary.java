package ru.progwards.java1.lessons.bitsworld;

public class Binary {

    byte num;

    public Binary(byte num) {
        this.num = num;
    }

    public static void main(String[] args) {
        Binary b = new Binary((byte) 27);
        System.out.println(b.toString());
    }

    public String toString() {
        String y = "";
        for (int i = 0; i < 8; i++) {
            y = (1 & num) + y;
            num >>= 1;
        }
        return y;
    }
}
