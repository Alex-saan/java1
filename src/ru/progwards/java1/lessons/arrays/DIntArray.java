package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] mass;

    DIntArray() {
        mass = new int[0];
    }

    public void add(int num) {
        int[] massNew = Arrays.copyOf(mass, mass.length + 1);
        massNew[massNew.length] = num;
    }

    public void atInsert(int pos, int num) {
        int[] massNew1 = new int[mass.length + 1];
        System.arraycopy(mass, 0, massNew1, pos, massNew1.length);
        massNew1[pos] = num;
    }

    public void atDelete(int pos) {

    }

    public int at(int pos) {
        return mass[pos];
    }

    public static void main(String[] args) {

    }


}
