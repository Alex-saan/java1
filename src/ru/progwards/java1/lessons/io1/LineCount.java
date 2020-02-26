package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.util.Scanner;

public class LineCount {
    public static int calcEmpty(String fileName) {
        int count;
        try {
            FileReader fr = new FileReader(fileName);
            Scanner scan = new Scanner(fr);
            count = 0;
            while (scan.hasNextLine()) {
                if (scan.nextLine().isEmpty()) {
                    count++;
                }
                System.out.println(count);
            }
            fr.close();
            scan.close();
        } catch (Exception e) {
            return -1;
        }
        return count;
    }

    public static void main(String[] args) {
        String Doc2 = "f:/Java/Doc1.txt";
        System.out.println(calcEmpty(Doc2));
    }
}