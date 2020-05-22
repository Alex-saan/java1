package ru.progwards.java1.lessons.maps;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SalesInfo {
    private List<String[]> list = new ArrayList<>();

    public int loadOrders(String fileName) {
        String[] str;
        String words;
        int count = 0;
        try (FileReader fileReader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                words = scanner.nextLine();
                str = words.split(", ");
                if (str.length == 4) {
                    try {
                        Integer.parseInt(str[2]);
                        Double.parseDouble(str[3]);
                        list.add(str);
                        count++;
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public Map<String, Double> getGoods() {
        TreeMap<String, Double> treeMap = new TreeMap<>();
        for (String[] strings : list) {
            if (treeMap.containsKey(strings[1])) {
                treeMap.replace(strings[1], treeMap.get(strings[1]) + Double.parseDouble(strings[3]));
            } else
                treeMap.put(strings[1], Double.parseDouble(strings[3]));
        }
        return treeMap;
    }


    public Map<String, AbstractMap.SimpleEntry<Double, Integer>> getCustomers() {
        TreeMap<String, AbstractMap.SimpleEntry<Double, Integer>> treeMap = new TreeMap<>();
        for (String[] strings : list) {

            if (treeMap.containsKey(strings[0])) {
                AbstractMap.SimpleEntry<Double, Integer> absMap = treeMap.get(strings[0]);
                absMap = new AbstractMap.SimpleEntry(Double.parseDouble(strings[3]) + absMap.getKey(), Integer.parseInt(strings[2]) + absMap.getValue());
                treeMap.replace(strings[0], absMap);

            } else {
                AbstractMap.SimpleEntry<Double, Integer> absMap = new AbstractMap.SimpleEntry<>(Double.parseDouble(strings[3]), Integer.parseInt(strings[2]));
                treeMap.put(strings[0], absMap);
            }
        }
        return treeMap;
    }

    public static void main(String[] args) {
        SalesInfo salesInfo = new SalesInfo();
        salesInfo.loadOrders("C:\\Users\\User\\IdeaProjects\\ProgWards\\src\\ru\\progwards\\java1\\lessons\\maps\\Test.txt");
        salesInfo.getGoods();
        System.out.println(salesInfo.getCustomers());
    }
}