package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName) {
        try {
            FileReader iF = new FileReader(inFileName);
            Scanner scan = new Scanner(iF);
            FileWriter oF = new FileWriter(outFileName);
            String y = "";
            try {
                while (scan.hasNext()) {
                    char[] x = scan.next().toCharArray();
                    for (int i = 0; i < x.length; i++) {
                        System.out.println((int) x[i]);
                        y += code[(int) x[i]];
                    }
                    y = "";
                    oF.write(Arrays.toString(x));
                }
            } finally {
                scan.close();
                iF.close();
                oF.close();
            }
        } catch (Exception e) {
            try {
                FileWriter log = new FileWriter(logName);
                try {
                    log.write(e.getMessage());
                } finally {
                    log.close();
                }
            } catch (Exception e1) {
                System.out.println(e1.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        String Doc1 = "f:/Java/Doc1.txt";
        String Doc2 = "f:/Java/Doc2.txt";
        String DocLog = "f:/Java/DocLog.txt";
        char[] code = {};
        codeFile(Doc1, Doc2, code, DocLog);
    }
}
