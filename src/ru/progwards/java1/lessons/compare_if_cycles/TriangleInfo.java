package ru.progwards.java1.lessons.compare_if_cycles;


public class TriangleInfo {

    public static void main(String[] args) {
        isTriangle(1, 1, 1);
        isRightTriangle(3, 4, 5);
        isIsoscelesTriangle(5, 4, 5);
    }

    public static boolean isTriangle(int a, int b, int c) {
        return (a < b + c && b < a + c && c < a + b);
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        return (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b);
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        return (a == b || a == c || b == c);
    }

}
