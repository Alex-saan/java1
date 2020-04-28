package ru.progwards.java1.lessons.sets;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LettersInFile {
    public static String process(String fileName) throws IOException {
        String scan = "";
        char[] tmp;
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
        //String bukv = String.valueOf(treeSet);
        return String.valueOf(treeSet).replace(",", "").replace("[","").replace("]","");
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