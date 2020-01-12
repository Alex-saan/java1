package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;

    public static void main(String[] args) {
        Eratosthenes x = new Eratosthenes(24);
        x.isSimple(12);
    }

    public Eratosthenes(int N) {
        boolean[] sieve = new boolean[N];
        this.sieve = sieve;
        Arrays.fill(sieve, true);
        sift();

    }

    private void sift() {
        for (int i = 2; i < sieve.length - 1; i++) {
            for (int j = i; j < sieve.length - 1; j++) {
                if (i * j > sieve.length - 1) break;
                sieve[i * j] = false;
            }
        }
    }

    public boolean isSimple(int n) {
        return sieve[n];
    }
}
