package ru.progwards.java1.lessons.io2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Censor {
    public static void censorFile(String inoutFileName, String[] obscene) throws IOException {
        try (RandomAccessFile fIO = new RandomAccessFile(inoutFileName, "rw")) {
            String str = "";
            String out = "";
            String result = fIO.readLine();
            //System.out.println(result);
            Arrays.sort(obscene);
            char[] tmp;
            tmp = fIO.toString().toCharArray();
            for (int i = 0; i < tmp.length; i++) {
                if (Character.isAlphabetic(tmp[i])) {
                    str += tmp[i];
                } else {
                    if (str != "") {
                        if (Arrays.binarySearch(obscene, str) != -1) {
                            out = methodStar(str);
                            result=result.replaceAll(str,out);
                            System.out.println(str);
                            System.out.println(out);
                            System.out.println(result);
                        }
                        str = "";
                    }
                }
            }
            //System.out.println(result);
            FileWriter fileWriter = new FileWriter(inoutFileName);
            fileWriter.write(result);

        } catch (IOException CensorException) {
            throw CensorException;
        }
    }

    public static String methodStar(String str) {
        String star = "";
        for (int i = 0; i < str.length(); i++) {
            star += "*";
        }
        return star;
    }

    public static void main(String[] args) {
        String Doc1 = "f:/Java/Doc1.txt";
        String[] obscene = {"Java", "Oracle", "Sun", "Microsystems"};
        try {
            censorFile(Doc1, obscene);
        } catch (IOException CensorException) {
            CensorException.getMessage();
        }
    }
}