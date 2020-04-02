package ru.progwards.java1.lessons;

import java.io.IOException;

public class doSom {
    public void doSomething(int n) throws IOException {
        return;
    }

    public void test(int n) throws IOException {
        try {
            doSomething(n);
        } catch (
                Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            System.out.println("finally executed");
        }
    }
}
