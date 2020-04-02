package ru.progwards.alex;

public class WordsInvert {

    public static String invertWords(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] mas = sentence.split(" ");
        String[] result = new String[mas.length];
        int j = mas.length - 1;

        for (int i = 0; i < mas.length; i++) {
            result[i] = mas[j];
            j--;
            sb.append(result[i]).append(".");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(invertWords("Буря мглою небо кроет"));
    }
}
