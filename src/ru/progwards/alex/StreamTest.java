package ru.progwards.alex;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StreamTest {
    private static int lineCount(String filename) throws IOException {
        int count;
        try {
            FileReader fr = new FileReader(filename);
            Scanner scan = new Scanner(fr);
            count = 0;
            while (scan.hasNext()) {
                scan.next();
                count++;
            }
            fr.close();
            scan.close();
        } catch (Exception e) {
            throw new IOException("файл не найден");
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        String Doc2 = "f:/Java/Doc2.txt";
        System.out.println(lineCount(Doc2));
    }
}
