package ru.progwards.java1.lessons.maps;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsageFrequency {
    HashMap<Character, Integer> hashMapChar = new HashMap<>();
    HashMap<String, Integer> hashMapStr = new HashMap<>();
    String word = "";

    public void processFile(String fileName) {
        try (FileReader fileReader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                word += scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<Character, Integer> getLetters() {
        char[] tmp = word.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            if (Character.isLetterOrDigit(tmp[i])) {
                if (hashMapChar.containsKey(tmp[i])) {
                    hashMapChar.replace(tmp[i], hashMapChar.get(tmp[i]) + 1);
                } else
                    hashMapChar.put(tmp[i], 1);
            }
        }
        return hashMapChar;
    }

    public Map<String, Integer> getWords() {
        String[] words = word.split("\\W+");
        for (int i = 0; i < words.length; i++) {
            if (hashMapStr.containsKey(words[i])) {
                hashMapStr.replace(words[i], hashMapStr.get(words[i]) + 1);
            } else
                hashMapStr.put(words[i], 1);
        }
        return hashMapStr;
    }

    public static void main(String[] args) {
        UsageFrequency usageFrequency = new UsageFrequency();

        usageFrequency.processFile("C:\\Users\\User\\IdeaProjects\\ProgWards\\src\\ru\\progwards\\java1\\lessons\\maps\\wiki.test.tokens");
        for (var entryCh : usageFrequency.getLetters().entrySet()) {
            //System.out.println(entryCh);
        }
        for (var entryStr : usageFrequency.getWords().entrySet())
            System.out.println(entryStr);
    }
}