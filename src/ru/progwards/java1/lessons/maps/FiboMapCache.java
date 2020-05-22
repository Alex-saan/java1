package ru.progwards.java1.lessons.maps;

import java.math.BigDecimal;
import java.util.HashMap;

public class FiboMapCache {
    private HashMap<Integer, BigDecimal> fiboCache = new HashMap<>();
    private boolean cacheOn;

    public FiboMapCache(boolean cacheOn) {
        this.cacheOn = cacheOn;
    }

    public BigDecimal fiboNumber(int n) {
        BigDecimal res;
        if (cacheOn == true && fiboCache != null && fiboCache.containsKey(n)) {
            return fiboCache.get(n);
        } else {
            BigDecimal a = BigDecimal.ONE;
            BigDecimal b = BigDecimal.ONE;
            BigDecimal c = BigDecimal.ONE;
            for (int i = 3; i <= n; i++) {
                c = a.add(b);
                a = b;
                b = c;
            }
            res = c;
        }
        if (fiboCache != null) {
            fiboCache.put(n, res);
        }
        return res;
    }

    public void clearCahe() {
        fiboCache.clear();
    }

    public static void test() {
        FiboMapCache fiboMapCacheOn = new FiboMapCache(true);
        FiboMapCache fiboMapCacheOff = new FiboMapCache(false);

        long start2 = System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++) {
            fiboMapCacheOff.fiboNumber(i);
        }
        long end2 = System.currentTimeMillis() - start2;
        fiboMapCacheOff.clearCahe();
        System.out.println("fiboNumber cacheOn=false время выполнения " + end2);

        long start1 = System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++) {
            fiboMapCacheOn.fiboNumber(i);
        }
        long end1 = System.currentTimeMillis() - start1;
        fiboMapCacheOn.clearCahe();
        System.out.println("fiboNumber cacheOn=true время выполнения " + end1);
    }

    public static void main(String[] args) {
        test();
    }
}