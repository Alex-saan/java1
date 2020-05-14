package ru.progwards.java1.lessons.queues;

import java.util.*;

public class CollectionsSort {

    public static void mySort(Collection<Integer> data) {
        List<Integer> dInt = new ArrayList(data);
        for (int i = 0; i < dInt.size(); ++i) {
            for (int j = i + 1; j < dInt.size(); ++j) {
                if (dInt.get(j) < dInt.get(i)) {
                    Integer tmp = dInt.get(i);
                    dInt.set(i, dInt.get(j));
                    dInt.set(j, tmp);
                }
            }
        }
        data.clear();
        data.addAll(dInt);
    }

    public static void minSort(Collection<Integer> data) {
        List<Integer> dInt = new ArrayList(data);
        List<Integer> out = new ArrayList();
        Integer x;
        while (!dInt.isEmpty()) {
            x = Collections.min(dInt);
            out.add(x);
            dInt.remove(x);
        }
        data.clear();
        data.addAll(out);
    }

    public static void collSort(Collection<Integer> data) {
        List<Integer> dInt = new ArrayList(data);
        Collections.sort(dInt);
        data.clear();
        data.addAll(dInt);
    }

    public static Collection<String> compareSort() {
        TreeSet<SortOut> treeSet = new TreeSet<>();

        List<Integer> lInt = new ArrayList();
        for (int i = 0; i < 10000; ++i) {
            lInt.add(i);
        }

        var startTime = new Date().getTime();
        minSort(lInt);
        long x = (new Date().getTime() - startTime);
        SortOut sortOutMin = new SortOut("minSort", x);
        startTime = new Date().getTime();
        collSort(lInt);
        long y = (new Date().getTime() - startTime);
        SortOut sortOutcoll = new SortOut("collSort", y);
        startTime = new Date().getTime();
        mySort(lInt);
        long z = (new Date().getTime() - startTime);
        SortOut sortOutMy = new SortOut("mySort", z);
        treeSet.add(sortOutMin);
        treeSet.add(sortOutcoll);
        treeSet.add(sortOutMy);

        return new ArrayList(treeSet);
    }

    public static void main(String[] args) {
        System.out.println(compareSort());
    }
}