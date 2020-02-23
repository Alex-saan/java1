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
                    for (int i = 0; i < x.length; i++) {
                        String[] y = new String[filter.length()];
                        //if (x[i] == y[i]){
                        if (String.valueOf(x[i]).compareToIgnoreCase(String.valueOf(y[i])) != 0) {
                            x[i] = ' ';
                        }
                    }
                    oF.write(x);
                }
            } finally {
                scan.close();
                iF.close();
                oF.close();
            }
        } catch (Exception e) {
            System.out.println();
        }
        return inFileName;
    }

    public static void main(String[] args) throws Exception {
        String Doc1 = "f:/Java/Doc1.txt";
        String Doc2 = "f:/Java/Doc2.txt";
        System.out.println(filterFile(Doc1, Doc2, " -,.()"));

    }
}


