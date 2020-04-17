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
        List<Integer> lInt = new ArrayList();
        for (int i = n * 2; i >= 0; i--) {
            if (!(i % 2 == 0))
                lInt.add(i);
        }
        return lInt;
    }

    public static Collection<Integer> fill3(int n) {
        List<Integer> lInt = new ArrayList();
        for (int i = 0; i < n * 3; i += 3) {
            lInt.add(i);
            lInt.add(i * i);
            lInt.add(i * i * i);
        }
        return lInt;
    }

    public static void main(String[] args) {
        //Creator nm = new Creator();

        //System.out.println(fillEven(5));
        //System.out.println(fillOdd(18));
        //System.out.println(fill3(3));
    }
}
