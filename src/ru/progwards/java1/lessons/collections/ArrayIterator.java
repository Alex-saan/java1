package ru.progwards.java1.lessons.collections;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private T[] array;
    private int position = -1;

    ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return position < array.length;
    }

    @Override
    public T next() {
        if (++position < array.length) {
            return array[position];
        }
        return null;
    }

    public static void main(String[] args) {
        String[] str = {"a", "b", "c", "d", "e", "f", "j", "h", "i"};
        ArrayIterator<String> ai = new ArrayIterator(str);
        for (int i = 0; i <str.length; i++) {
            System.out.println(ai.next());
        }

    }
}