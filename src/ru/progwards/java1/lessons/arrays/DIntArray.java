package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] mass;

    DIntArray() {
        mass = new int[0];
    }

    public void add(int num) {
        int[] massNew = Arrays.copyOf(mass, mass.length + 1);
        massNew[massNew.length - 1] = num;
    }

    public void atInsert(int pos, int num) {
        int[] massNew1 = new int[mass.length + 1];
        System.arraycopy(mass, 0, massNew1, 0, massNew1.length);
        massNew1[pos] = num;
        System.arraycopy(mass, pos, massNew1, pos + 1, massNew1.length);
    }

    public void atDelete(int pos) {
        int[] massNew2 = new int[mass.length - 1];
        System.arraycopy(mass, pos, massNew2, pos - 1, massNew2.length);
    }

    public int at(int pos) {
        return mass[pos];
    }

    public static void main(String[] args) {

    }


}
