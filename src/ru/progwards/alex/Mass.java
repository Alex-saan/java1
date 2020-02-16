package ru.progwards.alex;

public class Mass {

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1};
        System.out.println(sumArrayItems(a));
    }

    public static int sumArrayItems(int[] a) {
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            summ += a[i];
        }
        return summ;
    }

}
