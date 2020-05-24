package ru.progwards.alex;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterTest {
    public void iterator3(ListIterator<Integer> iterator) {
        for (int i = 0; iterator.hasNext(); i++) {
            if(iterator.next()%3==0){
                iterator.set(i);
            }
        }
    }

    public static void main(String[] args) {
        IterTest iT = new IterTest();
        LinkedList<Integer> list = new LinkedList();
        ListIterator listIterator = list.listIterator();
        iT.iterator3(listIterator);
    }
}