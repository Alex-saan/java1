package ru.progwards.alex;
import java.io.IOException;

public class Except {

    public String test(String filename) throws IOException {
        try {
            filename.toString();
            return "File processing";
        } catch (Exception e) {
            throw new IOException("File not found");
        }
    }
}
