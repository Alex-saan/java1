package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static void main(String[] args) {
        reverseDigits(123);
    }
    public static int reverseDigits(int number) {
        int result = 0;
        do {
            result = result * 10 + number % 10;
            System.out.println(result);
        }
        while ((number /= 10) != 0);
        return result;
    }
}