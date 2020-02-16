package ru.progwards.alex;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(containsDigit(12345, 6));

    }

    public static boolean containsDigit(int number, int digit) {
        int x = 0;
        do {
            x = number % 10;
        }
        while (((number /= 10) != 0) & x != digit);

        return true;
    }
}