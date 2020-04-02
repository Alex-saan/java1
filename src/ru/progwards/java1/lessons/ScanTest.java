package ru.progwards.java1.lessons;

import java.util.Scanner;

public class ScanTest {
    public static void scanLines() {
        try (Scanner scan = new Scanner(System.in)) {
            for (; ; ) {
                String s = scan.nextLine();
                if (s.contains("Привет")) {
                    System.out.println("Здравствуйте!");
                } else if (s.contains("как дела")) {
                    System.out.println("Хорошо");
                } else if (s.contains("/stop")) {
                    break;
                } else System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        scanLines();
    }
}