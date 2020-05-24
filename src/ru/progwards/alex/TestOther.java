package ru.progwards.alex;

import java.util.*;

public class TestOther {

    public static int sumLastAndFirst(ArrayDeque<Integer> deque) {
        if (deque.isEmpty()) {
            return 0;
        }
        return deque.peekFirst() + deque.pollLast();
    }

    ArrayDeque<Integer> array2queue(int[] a) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque();
        for (int i = 0; i < a.length; i++) {
            arrayDeque.add(a[i]);
        }
        return arrayDeque;
    }

    void dequeueTest() {
        ArrayDeque deque = new ArrayDeque<>();

        for (int i = 0; i <= 10; i++) {
            deque.offer(i);
            System.out.println(deque);
            if (i % 2 == 0)
                deque.poll();
        }

        System.out.println(deque);
    }

    public static void main(String[] args) {
        TestOther testOther = new TestOther();
        int[] a = {1, 2, 3, 1, 2, 6, 7, 8, 9};
        System.out.println(testOther.array2queue(a));
        //testOther.dequeueTest();

        //TestOther tO = new TestOther();
        //System.out.println(doTreeSet());
        //System.out.println(tO.a2set(new int[]{1, 1, 2, 3, 4, 5, 2, 1}));
        ArrayDeque deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);


        //System.out.println(sumLastAndFirst(deque));


//        ArrayDeque deque = new ArrayDeque<>();
//        for (int i = 0; i <= 10; i++) {
//            deque.offer(i);
//            if (i%2 == 0)
//                deque.poll();
//        }
//        System.out.println(deque);


    }


//    public static String doTreeSet() {
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        treeSet.add(9);
//        treeSet.add(1);
//        treeSet.add(5);
//        treeSet.add(2);
//        treeSet.add(4);
//        treeSet.add(8);
//
//        String s = "";
//        Iterator<Integer> iterator = treeSet.descendingIterator();
//        while (iterator.hasNext())
//            s += iterator.next();
//        return (s);
//    }
//    public Set<Integer> a2set(int[] a) {
//        Set<Integer> intSet = new HashSet<>();
//        for (int x : a) {
//            intSet.add(x);
//        }
//        return intSet;
//    }

//        Set<Integer>  fiboSet1000 =
//                Set.of(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987);
//        int sum = 0;
//        for (int i = 2; i < 10; i++)
//            sum += fiboSet1000.contains(i) ? 1 : 0;
//        System.out.println(sum);
//    }

//            String TEXT = "на дворе трава на траве дрова не руби дрова на траве двора";
//            Set<String> wordSet = new HashSet<>(Arrays.asList(TEXT.split(" ")));
//
//            Iterator<String> iter = wordSet.iterator();
//            while (iter.hasNext())
//                if (iter.next().contains("ра"))
//                    iter.remove();
//
//            System.out.println(wordSet.size());
//        }

//            Set<Integer> iSet = new HashSet<>();
//            for (int i = 0; i < 3; i++)
//                for (int j = 0; j < 3; j++) {
//                    iSet.add(i+j);
//                    //System.out.println(i+j);
//                }
//            System.out.println(iSet.size());
}

//        List<Integer> linkedList = new LinkedList();
//        for (int i = 0; i < 5; i++)
//            linkedList.add(i);
//        for (ListIterator<Integer> listIterator = linkedList.listIterator(); listIterator.hasNext(); ) {
//            Integer n = listIterator.next();
//            if (n % 2 != 0)
//                listIterator.remove();
//            else {
//                listIterator.add(n*2);
//                //listIterator.add(0);
//            }
//        }
//        System.out.println(linkedList);
//    }