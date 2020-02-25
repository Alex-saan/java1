package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineCount {
    public static int calcEmpty(String fileName) {
        int count;
        try {
            FileReader fr = new FileReader(fileName);
            Scanner scan = new Scanner(fr);
            count = 0;
            while (scan.hasNext()) {
                scan.next();
                if (scan.next().isEmpty()) {
                    count++;
                }
                fr.close();
                scan.close();
            }
        } catch (Exception e) {
            count = -1;
        }
        return count;
    }
}


