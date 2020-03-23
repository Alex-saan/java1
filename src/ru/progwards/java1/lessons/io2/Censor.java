package ru.progwards.java1.lessons.io2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Censor {
    public static void censorFile(String inoutFileName, String[] obscene) throws IOException {
        String result;
        try (FileReader fileReader = new FileReader(inoutFileName)) {
            Scanner scanner = new Scanner(fileReader);
            String word = "";
            String out = "";
            while (scanner.hasNextLine()) {
                result = scanner.nextLine();
                Arrays.sort(obscene);
                char[] tmp = result.toCharArray();
                for (int i = 0; i < tmp.length; i++) {
                    if (Character.isAlphabetic(tmp[i])) {
                        word += tmp[i];
                    } else {
                        if (word != "") {
                            if (Arrays.binarySearch(obscene, word) >= 0) {
                                out = methodStar(word);
                                result = result.replaceAll(word, out);
                            }
                            word = "";
                        }
                    }
                }

                try (FileWriter fileWriter = new FileWriter(inoutFileName)) {
                    fileWriter.write(result);
                }
            }
        }
    }

    public static String methodStar(String str) {
        String star = "";
        for (int i = 0; i < str.length(); i++) {
            star += "*";
        }
        return star;
    }
    public static class CensorException {
        private String inoutFileName;

        @Override
        public String toString() {
            return inoutFileName;
        }
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