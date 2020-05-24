package ru.progwards.alex;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    HashMap<Integer, String> a2map(int[] akey, String[] aval) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < akey.length; i++) {
            hashMap.put(akey[i], aval[i]);
        }
        return hashMap;
    }

    int fillHoles(Map<Integer, String> map, int size) {
        //HashMap<Integer, String> hashMap = new HashMap<>(map);
        int x = 0;
        String n;
        for (int i = 1; i <= size; i++) {
            n = map.putIfAbsent(i, "Число " + i);
            if (n == null) {
                x++;
            }
        }
        return x;
    }

    static void checkAndAdd(TreeMap<Integer, String> map, Integer key, String value) {
        if (map.isEmpty() == false && key > map.firstKey() && key < map.lastKey()) {
            map.putIfAbsent(key, value);
        }
    }

    public static void main(String[] args) {
        MapTest mapTest = new MapTest();
        TreeMap<Integer, String> map = new TreeMap<>();
        checkAndAdd(map, 0, "Zero");
        checkAndAdd(map, 0, "Zero");
        //checkAndAdd(map, 0, "Zero");
        //System.out.println(map);
        System.out.print(mapTest.fillHoles(map, 4) + ":");
        System.out.print(map);
    }
}