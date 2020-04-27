package ru.progwards.java1.lessons.sets;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LettersInFile {
    public static String process(String fileName) throws IOException {
        String result = "";
        String word = "";
        try (FileReader fileReader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                result = scanner.nextLine();
                char[] tmp = result.toCharArray();
                for (int i = 0; i < tmp.length; i++) {
                    if (Character.isAlphabetic(tmp[i])) {
                        word += tmp[i];
                    }
                }
            }
        }
        char[] wc = word.toCharArray();
        Arrays.sort(wc);
        String sorted = new String(wc);
        return sorted;
    }

    public static void main(String[] args) throws IOException {
        String Doc1 = "f:/Java/Doc1.txt";
        System.out.println(process(Doc1));
    }
}