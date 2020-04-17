package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Finder {
    public static Collection<Integer> findMinSumPair(Collection<Integer> numbers) {
        List<Integer> in = new ArrayList(numbers);
        List<Integer> index = new ArrayList();
        index.add(0);
        index.add(1);
        Integer min = in.get(0) + in.get(1);
        for (int i = 1; i < numbers.size() - 1; i++) {
            if (min > (in.get(i) + in.get(i + 1))) {
                index.set(0, i);
                index.set(1, i + 1);
                min = in.get(i) + in.get(i + 1);
            }
            System.out.println(min);
        }
        return index;
    }

    public static Collection<Integer> findLocalMax(Collection<Integer> numbers) {
        List<Integer> in = new ArrayList(numbers);
        List<Integer> max = new ArrayList();
        for (int i = 1; i < numbers.size(); i++) {
            if (in.get(i - 1) < in.get(i) && in.get(i) > in.get(i + 1)) {
                max.add(in.get(i));
            }
        }
        return max;
    }

    public static boolean findSequence(Collection<Integer> numbers) {
        List<Integer> in = new ArrayList(numbers);
        List<Integer> contain = new ArrayList();
        for (int i = 1; i < numbers.size(); i++) {
            contain.add(i);
        }
        boolean x = in.containsAll(contain);
        System.out.println(contain);
        System.out.println(numbers);
        return x;
    }

    //    найдите максимальное количество повторяющихся подряд элементов. Результат вернуть в виде строки <элемент>:<количество>,
//    например Василий:5. При равенстве максимального количества у разных повторяющихся элементов, вернуть результат для элемента,
//    повторяющаяся последовательность которого началась с наименьшего индекса.
    public static String findSimilar(Collection<String> names) {
        List<String> in = new ArrayList(names);
        String res = "";
        String resOut = "";
        int result = 1;
        int resultOut = 1;
        for (int i = 0; i < names.size() - 1; i++) {
            if (in.get(i) == in.get(i + 1)) {
                result++;
                res = in.get(i);
                continue;
            }
            if (result > resultOut) {
                resOut = res;
                resultOut = result;
                System.out.println(res);
                res = "";
                result = 1;
            }
        }
        if (resultOut < result) {
            return res + ":" + result;
        }
        return resOut + ":" + resultOut;
    }

    public static void main(String[] args) {
        List<Integer> lInt = new ArrayList();
//        lInt.add(1);
////        lInt.add(10);
////        lInt.add(2);
////        lInt.add(30);
////        lInt.add(4);
////        lInt.add(50);
////        lInt.add(6);
////        lInt.add(1);
////        lInt.add(8);
////        lInt.add(90);
////        lInt.add(10);
////        lInt.add(110);
////        lInt.add(12);
        //System.out.println(findMinSumPair(lInt));
        //System.out.println(findLocalMax(lInt));
//        lInt.add(0);
//        lInt.add(1);
//        lInt.add(2);
//        lInt.add(3);
//        lInt.add(4);
//        lInt.add(5);
//        lInt.add(6);
//        lInt.add(7);
//        lInt.add(8);
//        lInt.add(9);
//        lInt.add(10);
//        lInt.add(11);
//        lInt.add(12);
        //System.out.println(findSequence(lInt));
        List<String> str = new ArrayList();
        str = List.of("вася", "вася", "петя", "петя", "петя", "дима", "дима", "дима","дима","миша","миша","миша","миша","миша");
        System.out.println(findSimilar(str));

    }
}
