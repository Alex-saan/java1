package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static void main(String[] args) {
        maxSide(5, 8, 9);
        minSide(2, 1, 0);
        isEquilateralTriangle(2, 2, 2);
        isEquilateralTriangle(1, 2, 1);
    }

    public static int maxSide(int a, int b, int c) {
        if (b < a && c < a) {
            return a;
        } else if (a < b && c < b) {
            return b;
        } else
            return c;
    }

    public static int minSide(int a, int b, int c) {
        if (b > a && c > a) {
            return a;
        } else if (a > b && c > b) {
            return b;
        } else
            return c;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        return (a == b || b == c || a == c);
    }
}