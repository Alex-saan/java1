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
                    String[] x = new String[scan.nextLine().length()];
                    String[] y = new String[filter.length()];
                    System.out.println(Arrays.toString(y));
                    for (int i = 0; i < y.length; i++) {
                        for (int j = 0; j < x.length; j++) {
                            if (x[i] == y[i]) {
                                z += x[i];
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