package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineCount {
    public static int calcEmpty(String fileName) throws IOException {
        int count;
        try {
            FileReader fr = new FileReader(fileName);
            Scanner scan = new Scanner(fr);
            count = 0;
            while (scan.hasNext()) {
                scan.next();
                if (scan.next().length() == 0) {
                    count++;
                }
                fr.close();
                scan.close();
            }
        } catch (Exception e) {
            return -1;
        }
        return count;
    }
}


