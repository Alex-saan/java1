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
        String[] str = {"a", "b", "b", "b", "b", "b", "b", "b", "b"};
        ArrayIterator<String> ai = new ArrayIterator(str);
        System.out.println(ai.next());
    }
}