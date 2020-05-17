package ru.progwards.java1.lessons.maps;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SalesInfo {
    private String word;

    public int loadOrders(String fileName) {
        try (FileReader fileReader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                word += scanner.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }



    public static void main(String[] args) {
        SalesInfo salesInfo = new SalesInfo();
        salesInfo.loadOrders("C:\\Users\\User\\IdeaProjects\\ProgWards\\src\\ru\\progwards\\java1\\lessons\\maps\\Test.txt");
    }
}