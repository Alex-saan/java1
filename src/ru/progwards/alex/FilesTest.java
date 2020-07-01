package ru.progwards.alex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class FilesTest {
    String createFolder(String name) {
        Path path = Paths.get(".");
        new File(name).mkdir();
        Path res = path.toAbsolutePath().normalize().getParent();
        return String.valueOf(res);
    }

    boolean replaceF(String name) {
        try {
            String string = Files.readString(Paths.get(name));
            String res = string.replaceAll("F", "f");
            Files.writeString(Paths.get(name), res);
        } catch (IOException e) {
            e.getMessage();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        FilesTest files = new FilesTest();
        System.out.println(files.createFolder("runs"));
    }
}