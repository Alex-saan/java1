package ru.progwards.alex;

import java.io.IOException;
import java.io.RandomAccessFile;

public class StarsSet {
    public static String setStars(String filename) {
        String y = "";
        try (RandomAccessFile fI = new RandomAccessFile(filename, "rw")) {
            for (int i = 9; i < fI.length(); i = i + 10) {
                fI.seek(i);
                y += (char) fI.read();
                fI.seek(i);
                fI.write((int) '*');
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return y;
    }

    public static void main(String[] args) {
        String Doc2 = "f:/Java/Doc1.txt";
        System.out.println(setStars(Doc2));
    }
}
