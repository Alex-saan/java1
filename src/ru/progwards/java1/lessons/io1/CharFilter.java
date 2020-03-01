package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class CharFilter {
    public static String filterFile(String inFileName, String outFileName, String filter) throws Exception {
        try {
            FileReader iF = new FileReader(inFileName);
            Scanner scan = new Scanner(iF);
            FileWriter oF = new FileWriter(outFileName);
            String z = "";
            try {
                while (scan.hasNextLine()) {

                    char[] chars = scan.next().toCharArray();

                    char[] chars1 = filter.toCharArray();

                    for (int i = 0; i < chars1.length; i++) {
                        for (int j = 0; j < chars.length; j++) {
                            if (chars[i] != chars1[i]) {
                                z += chars[i];
                            }
                        }
                    }
                }
                oF.write(z);
            } finally {
                scan.close();
                iF.close();
                oF.close();
            }
        } catch (
                Exception e) {
            System.out.println(e.getMessage());
        }
        return inFileName;
    }

    public static void main(String[] args) throws Exception {
        String Doc1 = "f:/Java/Doc1.txt";
        String Doc2 = "f:/Java/Doc2.txt";
        filterFile(Doc1, Doc2, " -,.()");
    }
}