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
            try {
                while (scan.hasNext()) {
                    char[] x = scan.next().toCharArray();
                    String[] y = new String[filter.length()];
                    for (int i = 0; i < y.length; i++) {
                        for (int j = 0; j < x.length; j++) {
                            if (Arrays.toString(y).compareTo(Arrays.toString(x)) != 0) {
                                y[j] = String.valueOf(x[j]);
                            }
                        }
                    }
                    oF.write(String.valueOf(y));
                }
            } finally {
                scan.close();
                iF.close();
                oF.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return inFileName;
    }

    public static void main(String[] args) throws Exception {
        String Doc1 = "f:/Java/Doc1.txt";
        String Doc2 = "f:/Java/Doc2.txt";
        System.out.println(filterFile(Doc1, Doc2, " -,.()"));
    }
}