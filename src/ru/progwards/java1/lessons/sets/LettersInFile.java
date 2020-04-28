package ru.progwards.java1.lessons.sets;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LettersInFile {
    public static String process(String fileName) throws IOException {
        String scan = "";
        char[] tmp;
        String bukv = "";
        TreeSet<Character> treeSet = new TreeSet<Character>();
        try (FileReader fileReader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                scan = scanner.nextLine();
                tmp = scan.toCharArray();
                for (int i = 0; i < tmp.length; i++) {
                    if (Character.isAlphabetic(tmp[i])) {
                        treeSet.add(tmp[i]);
                    }
                }
            }
        }
        for (Character ch : treeSet) {
            bukv += ch;
        }
        return bukv;
    }

    public static void main(String[] args) {
        String Doc1 = "C:\\Users\\User\\IdeaProjects\\ProgWards\\src\\ru\\progwards\\java1\\lessons\\sets\\Doc1.txt";
        try {
            System.out.println(process(Doc1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}