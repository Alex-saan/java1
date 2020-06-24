package ru.progwards.java1.lessons.files;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FilesSelect {
    String file = "";

    public void selectFiles(String inFolder, String outFolder, List<String> keys) throws IOException {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**/*.txt");
        try {
            Files.walkFileTree(Paths.get(inFolder), new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
                    if (pathMatcher.matches(path)) {
                        try {
                            file = Files.readString(path);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        for (String key : keys) {
                            if (file.contains(key)) {
                                Path newDir = Paths.get(outFolder).resolve(key);
                                try {
                                    Files.createDirectories(newDir);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                try {
                                    Files.copy(path, newDir.resolve(path.getFileName()), StandardCopyOption.REPLACE_EXISTING);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
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
    }

    public static void main(String[] args) {

        FilesSelect filesSelect = new FilesSelect();
        List<String> list = new ArrayList<>();
        list.add("String");
        try {
            filesSelect.selectFiles("d:/inFolder/", "d:/outFolder/", list);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}