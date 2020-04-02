package ru.progwards.alex;

import java.util.Arrays;

public class CharArr {
    public static void main(String[] args) {
        char[] x = new char[100];
        Arrays.fill(x, (char) 65);
        String y = "";
        //char[] y = new char[1000];
        for (int i = 0; i < x.length; i++) {

            x[i] = ((char) (x[i] + i));

            y = Arrays.toString(x) + "'";


        }

        System.out.println(y);
    }
}
