package ru.progwards.alex;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(reverseDigits(0, 0));
    }

    public static boolean reverseDigits(int number, int digit) {
        int result = 0;
        if (number == 0 && digit == 0) {
            return true;
        }
        number = number * 10;
        for (int i = 0; ((number /= 10) != 0); i++) {
            result = number % 10;
            if (result == digit) {
                return true;
            }
        }

        return false;
    }
}

