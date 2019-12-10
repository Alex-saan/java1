package ru.progwards.java1.lessons.basics;

public class Test {
    public static void main(String[] args) {
        System.out.println(reverseDigits(941));
    }

    public static int reverseDigits(int number) {
        int result = 0;
        for (int i = 1; (number /= 10) == 0; i++) ;
        {
            result = result * 10 + number % 10;

            System.out.println(result);
        }

        return result;


    }
}
