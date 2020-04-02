package ru.progwards.alex;

public class Test {
    public static String invertWords(String sentence) {
        String[] resWords = sentence.split(" ");
        String result = "";
        for (int i = 0; i < resWords.length; i++) {
            result = resWords[i] + " " + result;
        }
        result = result.trim();
        result = result.replace(" ", ".");
        return result;
    }

    public static void main(String[] args) {
        System.out.println(invertWords("Буря мглою небо кроет"));
    }
}
