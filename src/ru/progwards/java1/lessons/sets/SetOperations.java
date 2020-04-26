package ru.progwards.java1.lessons.sets;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        HashSet result = new HashSet(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        HashSet result = new HashSet(set1);
        result.retainAll(set2);
        return result;
    }

    public static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
        HashSet result = new HashSet(set1);
        result.removeAll(set2);
        return result;
    }

    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2) {
        HashSet result = new HashSet(set1);
        HashSet result1 = new HashSet(set2);
        HashSet resultTotal = new HashSet();
        result.removeAll(set1);
        result1.removeAll(set2);
        resultTotal.addAll(result);
        resultTotal.addAll(result1);
        return resultTotal;
    }
}
