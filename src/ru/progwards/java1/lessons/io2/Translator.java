package ru.progwards.java1.lessons.io2;

import java.io.IOException;

public class Translator {
    private String[] inLang;
    private String[] outLang;

    Translator(String[] inLang, String[] outLang) {
        this.inLang = inLang;
        this.outLang = outLang;
    }

    public String translate(String sentence) {
        String word = "";
        String out = "";
        String result = "";
        char[] tmp;
        tmp = sentence.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            if (Character.isAlphabetic(tmp[i])) {
                word += tmp[i];
            }
            if (!Character.isAlphabetic(tmp[i]) | i == tmp.length - 1) {
                if (word != "") {
                    for (int j = 0; j <= inLang.length; j++) {
                        if (word.toLowerCase().compareTo(inLang[j]) == 0) {
                            out = outLang[j];
                            break;
                        }
                    }
                    if (word.substring(0, 1).compareTo(word.substring(0, 1).toUpperCase()) == 0) {
                        out = out.substring(0, 1).toUpperCase() + out.substring(1);
                    }
                    result += out;
                    word = "";
                }
                if (!Character.isAlphabetic(tmp[i]))
                    result += tmp[i];
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Translator tr = new Translator(new String[]{"make", "love", "not", "war"}, new String[]{"твори", "любовь", "не", "войну"});
        System.out.println(tr.translate("make, love not war"));
    }
}