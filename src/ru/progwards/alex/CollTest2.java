package ru.progwards.alex;

import java.util.ArrayList;
import java.util.List;

public class CollTest2 {
    public List<Integer> filter(List<Integer> list) {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < (result / 100)) {
                list.remove(i);
                //i--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        CollTest2 name = new CollTest2();
        List<Integer> lInt = new ArrayList();
        lInt.add(0);
        lInt.add(10);
        lInt.add(2);
        lInt.add(30);
        lInt.add(4);
        lInt.add(50);
        lInt.add(6);
        lInt.add(70);
        lInt.add(8);
        lInt.add(1);
        lInt.add(10);
        lInt.add(2);
        lInt.add(120);
        System.out.println(name.filter(lInt));
    }
}