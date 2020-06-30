package ru.progwards.java1.lessons.io1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName) {
        try {
            FileReader iF = new FileReader(inFileName);
            FileWriter oF = new FileWriter(outFileName);
            String y = "";
            try {
                for (int c; (c = iF.read()) >= 0; ) {
                    y += code[c];
                }
                oF.write(y);
            } finally {
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
//        String Doc1 = "f:/Java/Doc1.txt";
//        String Doc2 = "f:/Java/Doc2.txt";
//        String DocLog = "f:/Java/DocLog.txt";
//        char[] code = {'1', '2', '3'};
//        codeFile(Doc1, Doc2, code, DocLog);
//        Path path2 = Paths.get("folder");


        String name = "jh";
        Path path = Paths.get(".");
        new File(name).mkdir();
        Path path1 = path.resolve(name);
        path1.toAbsolutePath().normalize().getParent().toString();

        System.out.println(path1);
    }
}