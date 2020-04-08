package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Creator {
    public static Collection<Integer> fillEven(int n) {
        List<Integer> lInt = new ArrayList();
        for (int i = 0; i < n; i++) {
            int x = i + 1;
            lInt.add(x * 2);
        }
        return lInt;
    }

    public static Collection<Integer> fillOdd(int n) {
        List<Integer> lInt = new ArrayList(n * 3);
        for (int i = n * 3 * 2; i >= 0; i--) {
            //int x = i + 1;
            if (!(i % 2 == 0))
                lInt.add(i);
        }
        return lInt;
    }

    public static Collection<Integer> fill3(int n) {
        List<Integer> lInt = new ArrayList();
        for (int i = 0; i < n; i++) {
            lInt.add(i);
            lInt.add(i * i);
            lInt.add(i * i * i);
        }
        return lInt;
    }

    public static void main(String[] args) {
        //Creator name = new Creator();
        //System.out.println(fillEven(5));
        //System.out.println(fillOdd(5));
        System.out.println(fill3(5));
    }
}
