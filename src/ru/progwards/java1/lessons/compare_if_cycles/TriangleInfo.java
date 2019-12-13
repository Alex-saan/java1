package ru.progwards.java1.lessons.compare_if_cycles;

import java.sql.SQLOutput;

public class TriangleInfo {
    public static void main(String[] args) {
        isTriangle(1, 1, 1);
        isRightTriangle(3, 4, 5);
        isIsoscelesTriangle(5, 4, 5);
    }

    public static boolean isTriangle(int a, int b, int c) {
        return (a < b + c || b < a + c || c < a + b);
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        int a1 = (int) Math.pow(a, 2);
        int b1 = (int) Math.pow(b, 2);
        int c1 = (int) Math.pow(c, 2);
        return (a1 == b1 + c1 || b1 == a1 + c1 || c1 == a1 + b1);
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        return (a == b || a == c || b == c);
    }

}
