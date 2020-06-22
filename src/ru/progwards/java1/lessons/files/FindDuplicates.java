package ru.progwards.java1.lessons.files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

    public List<List<String>> findDuplicates(String startPath) {
        List<Path> list = new ArrayList<>();
        List<List<String>> listOut = new ArrayList<>();
        try {
            Files.walkFileTree(Paths.get(startPath), new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
                    list.add(path);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException e) {
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                Path pathI = list.get(i);
                Path pathJ = list.get(j);
                if (pathI.getFileName().equals(pathJ.getFileName()) && i != j) {
                    try {
                        if (Files.readAttributes(pathI, "lastModifiedTime").equals(
                                Files.readAttributes(pathJ, "lastModifiedTime")) &&
                                Files.size(pathI) == Files.size(pathJ)
                        ) {
                            if (Arrays.equals(Files.readAllBytes(pathI),
                                    Files.readAllBytes(pathJ))
                            ) {
                                List<String> listN = new ArrayList<>();
                                listN.add(String.valueOf(pathI));
                                listN.add(String.valueOf(pathJ));
                                listOut.add(listN);
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        System.out.println(listOut);
        return listOut;
    }

    public static void main(String[] args) {
        FindDuplicates findDuplicates = new FindDuplicates();
        findDuplicates.findDuplicates("C:\\Users\\user\\Desktop\\Java");
    }
}