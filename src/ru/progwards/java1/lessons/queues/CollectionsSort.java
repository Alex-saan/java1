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
        List<Integer> lInt = new ArrayList();
        for (int i = 0; i < 10000; ++i) {
            lInt.add(i);
        }
        List<String> str = new ArrayList<>();


        var startTime = new Date().getTime();
        minSort(lInt);
        long x = (new Date().getTime() - startTime);
        System.out.println(x);
        startTime = new Date().getTime();
        collSort(lInt);
        long y = (new Date().getTime() - startTime);
        System.out.println(y);
        startTime = new Date().getTime();
        mySort(lInt);
        long z = (new Date().getTime() - startTime);
        System.out.println(z);

        str.addAll(List.of("collSort", "minSort", "mySort"));
        System.out.println(str.toString());

        return str;
    }

//    Comparator<SortOut> com1 = new Comparator<SortOut>() {
//        @Override
//        public int compare(SortOut o1, SortOut o2) {
//            return Integer.compare(o1.getTime(), o2.getTime());
//        }
//    };

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.addAll(List.of(2, 55, 68, 90, 38, 92, 35, 24, 19));
        mySort(list);

    }
}