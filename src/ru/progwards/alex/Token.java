package ru.progwards.alex;

import java.util.StringTokenizer;

public class Token {
    String swapWords(String sentance) {
        StringTokenizer tokenizer = new StringTokenizer(sentance, " .,-!\n");
        String result = "";
//        for (int i = 0; i < tokenizer.countTokens(); i++) {
//            String tmp = "";
//            String out = "";
//            tmp = tokenizer.nextToken();
//            out = tokenizer.nextToken() + " " + tmp;
//            result += out + " ";
//        }

        while (tokenizer.hasMoreTokens()) {
            String tmp = "";
            String out = "";
            tmp = tokenizer.nextToken();
            if (tokenizer.countTokens()>0){
                out = tokenizer.nextToken() + " " + tmp;
                result += out + " ";
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
//        String txt =
//                "StringTokenizer - этот класс, " +
//                        "нам строку разобьёт на раз.";
//        StringTokenizer tokenizer = new StringTokenizer(txt, " .,");
//        while (tokenizer.hasMoreTokens())
//            System.out.print(tokenizer.nextToken());

        Token token = new Token();
        token.swapWords("Убитых словом, добивают молчанием. (c) Уильям Шекспир.");
    }
}