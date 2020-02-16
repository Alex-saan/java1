package ru.progwards.alex;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(19));
    }
    public static long factorial(long value) {
        long a = 1;
        for (int i = 1; i <= value; i++) {
            a = a * i;
        }
        return a;
    }
}
