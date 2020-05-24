package ru.progwards.alex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollTest1 {

    public List<Integer> listAction(List<Integer> list) {
        list.remove(Collections.min(list));
        list.add(0, list.size());
        list.add(2, Collections.max(list));
        return list;
    }

    public static void main(String[] args) {
        CollTest1 name = new CollTest1();
        List<Integer> lInt = new ArrayList();
        lInt.add(4);
        lInt.add(1);
        lInt.add(4);
        lInt.add(2);
        lInt.add(3);
        lInt.add(4);
        System.out.println(name.listAction(lInt));
    }
}