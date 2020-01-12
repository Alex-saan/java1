package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] a = {1, 9, 3, 1, 8, 2, 5, -7, 5, 77, 11, -3};
        sort(a);
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[j] < a[i]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
                System.out.println(Arrays.toString(a));
            }
        }
    }
}

