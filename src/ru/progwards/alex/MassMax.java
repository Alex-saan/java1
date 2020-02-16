package ru.progwards.alex;

import java.util.Arrays;

public class MassMax {
    public static void main(String[] args) {
        int[] a = {1,6,8,21,6,3};
        arrayMax(a);
        System.out.println(arrayMax(a));
    }

    public static int arrayMax(int[] a) {
        if (a.length == 0) {
            return 0;
        } else {
            Arrays.sort(a);
            int x = a[a.length - 1];
            return (x);
        }
    }
}

