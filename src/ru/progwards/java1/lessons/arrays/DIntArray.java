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
        mass = Arrays.copyOf(mass, mass.length + 1);
    }

    public void atInsert(int pos, int num) {
        int[] massNew = new int[mass.length + 1];
        System.arraycopy(mass, 0, massNew, 0, massNew.length);
        massNew[pos] = num;
        System.arraycopy(mass, pos, massNew, pos + 1, massNew.length);
        mass = Arrays.copyOf(mass, mass.length + 1);
    }

    public void atDelete(int pos) {
        int[] massNew = new int[mass.length - 1];
        System.arraycopy(mass, pos, massNew, pos - 1, massNew.length);
        mass = Arrays.copyOf(mass, mass.length + 1);
    }

    public int at(int pos) {
        return mass[pos];
    }

    public static void main(String[] args) {

    }


}
