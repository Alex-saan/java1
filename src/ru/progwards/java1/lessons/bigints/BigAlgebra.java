package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.SortedMap;

import static java.math.BigInteger.valueOf;

public class BigAlgebra {
    static BigDecimal fastPow(BigDecimal num, int pow) {
        if (pow == 0)
            return BigDecimal.ONE;

        BigDecimal num1 = BigDecimal.ONE;
        while (1 < pow) {
            System.out.println(pow);
            if (pow % 2 == 0) {
                num = num.multiply(num);
                pow /= 2;
            } else {
                num1 = num.multiply(num1);
                pow -= 1;
            }
        }
        return num.multiply(num1);
    }

/*    public static BigInteger fibonacci(int n) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("0");

        if (n == 1) {
            return valueOf(1);
        }
        if (n == 2) {
            return valueOf(1);
        } else {
            for (int i = 3; i <= n; i++) {
                c = a.add(b);
                a = b;
                b = c;
            }
            return (c);
        }
    }*/

    public static void main(String[] args) {
        //System.out.println(fibonacci(99));
        System.out.println(fastPow(BigDecimal.valueOf(2), 11));
    }
}
