package ru.progwards.java1.lessons.io2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Censor {
    public static void censorFile(String inoutFileName, String[] obscene) throws CensorException {
        String result;
        try (FileReader fileReader = new FileReader(inoutFileName)) {
            Scanner scanner = new Scanner(fileReader);
            String word = "";
            String out = "";
            Arrays.sort(obscene);
            while (scanner.hasNextLine()) {
                result = scanner.nextLine();
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
                } catch (IOException e) {
                    throw new CensorException(e.getMessage(), inoutFileName);
                }
            }
        } catch (Exception e) {
            throw new CensorException(e.getMessage(),inoutFileName);
        }
    }

    public static String methodStar(String str) {
        String star = "";
        for (int i = 0; i < str.length(); i++) {
            star += "*";
        }
        return star;
    }

    static class CensorException extends Exception {
        private String inoutFileName;
        private String mess;

        CensorException(String mess, String inoutFileName) {
            this.inoutFileName = inoutFileName;
            this.mess = mess;
        }

        @Override
        public String toString() {
            return inoutFileName + ":"+ mess;
        }
    }

    public static void main(String[] args) {
        String Doc1 = "f:/Java/Doc1.txt";
        String[] obscene = {"Java", "Oracle", "Sun", "Microsystems"};
        try {
            censorFile(Doc1, obscene);
        } catch (Censor.CensorException CensorException) {
            CensorException.getMessage();
        }
    }
}