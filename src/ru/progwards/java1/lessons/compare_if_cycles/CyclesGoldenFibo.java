package ru.progwards.java1.lessons.compare_if_cycles;



public class CyclesGoldenFibo {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 1; i <= n; i++) {
            //System.out.print(fiboNumber(i) + " ");
        }

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j < 100; j++) {
                if (isGoldenTriangle(i, j, j)) {
                    System.out.println(j + " " + i + " " + i);
                }
            }
        }
        containsDigit(0, 0);
        fiboNumber(10);
        System.out.println(isGoldenTriangle(89, 89, 55));
    }

    public static boolean containsDigit(int number, int digit) {
        int result = 0;
        if (number == 0 && digit == 0) {
            return true;
        }
        number = number * 10;
        while ((number /= 10) != 0) {
            result = number % 10;
            if (result == digit) {
                return true;
            }
        }

        return false;
    }

    public static int fiboNumber(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        } else {
            int a = 1;
            int b = 1;
            int c = 0;
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {

        if ((a == b) && (1.61703 <= (float) b / (float) c) && ((float) b / (float) c <= 1.61903)) {

            return true;
        }
        if ((a == c) && (1.61703 <= (float) a / (float) b && (float) a / (float) b <= 1.61903)) {

            return true;
        }
        if ((b == c) && (1.61703 <= (float) b / (float) a) && ((float) b / (float) a <= 1.61903)) {

            return true;
        }
        else return false;
    }
}