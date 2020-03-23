package ru.progwards.java1.lessons.io2;


import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

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
            } else {
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
                result += tmp[i];
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Translator tr = new Translator(new String[]{"в", "лесу", "елочка", "родилась"}, new String[]{"in", "forest", "tree", "born"});
        System.out.println(tr.translate("В лесу, Родилась елочка!"));
    }
}