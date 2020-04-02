package ru.progwards.alex;

import java.util.*;

public class Collect {

    public List<Integer> listAction(List<Integer> list) {
        list.remove(Collections.min(list));
        list.add(0, list.size()-1);
        list.add(2, Collections.max(list));
        return list;
    }

    public static void main(String[] args) {
        Collect name = new Collect();
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