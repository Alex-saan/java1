package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CharFilter {
    public static String filterFile(String inFileName, String outFileName, String filter) throws Exception {
        try {
            FileReader iF = new FileReader(inFileName);
            Scanner scan = new Scanner(iF);
            FileWriter oF = new FileWriter(outFileName);
            String z = "";
            String c = "";
            try {
//                while (iF.read() != -1) {
//                    c = Integer.toString(iF.read());
//                    System.out.println(iF.read());
//                    if (!c.contains(filter)) {
//                        //System.out.println(c);
//                        c += c + "";
//                        //System.out.println(c);
//                    }
//                }
                while (scan.hasNext()) {
                    char[] chars = scan.next().toCharArray();
                    char[] chars1 = filter.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        int x = 0;
                        for (int j = 0; j < chars1.length; j++) {
                            if (chars[i] == chars1[j]) {
                                x = 1;
                            }
                        }
                        if (x == 1) {
                            continue;
                        }
                        z += chars[i];
                    }
                }
                oF.write(z);
            } finally {
                scan.close();
                iF.close();
                oF.close();
            }
        } catch (Exception e) {
            throw e;
        }
        return inFileName;
    }

    public static void main(String[] args) throws Exception {
        String Doc1 = "f:/Java/Doc1.txt";
        String Doc2 = "f:/Java/Doc2.txt";
        filterFile(Doc1, Doc2, " -,.()");
    }
}