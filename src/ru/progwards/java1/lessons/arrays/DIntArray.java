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
        mass = Arrays.copyOf(massNew, massNew.length);
    }

    public void atInsert(int pos, int num) {
        int[] massNew = new int[mass.length + 1];
        System.arraycopy(mass, 0, massNew, 0, mass.length);
        massNew[pos] = num;
        System.arraycopy(mass, pos, massNew, pos + 1, mass.length - pos);
        mass = Arrays.copyOf(massNew, massNew.length);
    }

    public void atDelete(int pos) {
        int[] massNew = new int[mass.length - 1];
        System.arraycopy(mass, 0, massNew, 0, mass.length - 1);
        System.arraycopy(mass, pos + 1, massNew, pos, mass.length - pos - 1);
        mass = Arrays.copyOf(massNew, massNew.length);
    }

    public int at(int pos) {
        return mass[pos];
    }

    public static void main(String[] args) {

    }


}
