package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo;

    public static class CacheInfo {
        public int n;
        public int fibo;

        CacheInfo(int n, int fibo) {
            this.n = n;
            this.fibo = fibo;
        }
    }

    //В статической функции fiboNumber, проверять параметр n на совпадение с последним рассчитанным значением,
    //и если совпадает - возвращать уже готовый результат. Если не совпадает - рассчитывать и сохранять в статической переменной lastFibo
    public static int fiboNumber(int n) {
        if (lastFibo != null)
            if (lastFibo.n == n) {
                return lastFibo.fibo;
            }
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
            //lastFibo = new CacheInfo(n, c);
            return c;
        }
    }

    public static CacheInfo getLastFibo() {
        return lastFibo;
    }

    public static void clearLastFibo() {
        lastFibo = null;
    }

    public static void main(String[] args) {
        lastFibo = new CacheInfo(29, 200);
        System.out.println(fiboNumber(29));
    }
}