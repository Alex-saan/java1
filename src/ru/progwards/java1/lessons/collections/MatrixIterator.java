package ru.progwards.java1.lessons.collections;

import java.util.Iterator;

public class MatrixIterator<T> implements Iterator<T> {

    private T[][] array;
    private int position1 = 0;
    private int position2 = 0;

    MatrixIterator(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (position2 == array[position1].length) {
            position1++;
            position2 = 0;
        }
        if (position1 >= array.length) {
            return false;
        }
        return position2 < array[position1].length;
    }

    @Override
    public T next() {
            return array[position1][position2++];
    }

    public static void main(String[] args) {
        String[][] str = {{"a", "b", "c", "d", "e", "f", "j", "h", "i"}, {"a", "b", "c", "d", "e"}};
        MatrixIterator<String> mi = new MatrixIterator<>(str);
        while (mi.hasNext()) {
            System.out.println(mi.next());
        }
    }
}