package ru.progwards.java1.lessons.interfaces;

import java.util.Arrays;

public class ArraySort {

    //Для класса ArraySort из задачи 2 урока 6 переделать сортировку массива целых чисел на сортировку через интерфейс
    // CompareWeight public static void sort(CompareWeight[] a)

    //    public static void sort(CompareWeight[] a) {
//        for (int i = 0; i < a.length; ++i) {
//            for (int j = i + 1; j < a.length; ++j) {
//                if (((Animal) a[j]).compareTo((Animal) a[i]) == -1) {
//                    CompareWeight tmp = ((Animal) a[i]);
//                    a[i] = a[j];
//                    a[j] = tmp;
//                }
//            }
//        }
//    }
    public static void sort(CompareWeight[] a) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[j].compareWeight(a[i]) == CompareWeight.CompareResult.LESS) {
                    CompareWeight tmp = ((Animal) a[i]);
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}