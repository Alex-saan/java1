package ru.progwards.alex;

import java.io.*;

public class StarsSetTest {
    public static void main(String args[]) throws IOException {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;
        String Doc1 = "f:/Java/Doc1.txt";
        String Doc2 = "f:/Java/Doc2.txt";

        try {
            fileIn = new FileInputStream(Doc1);
            fileOut = new FileOutputStream(Doc2);

            int a;
            // Копирование содержимого файла file.txt
            while ((a = fileIn.read()) != -1) {
                System.out.println(a);
                fileOut.write(a); // Чтение содержимого файла file.txt и запись в файл copied_file.txt
                //System.out.println(a);
            }
        }finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }

}