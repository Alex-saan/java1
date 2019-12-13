package ru.progwards.java1.lessons.basics;

public class Astronomy {

    public static void main(String[] args) {

        earthSquare();
        mercurySquare();
        jupiterSquare();
        System.out.println(earthVsMercury());
        System.out.println(earthVsJupiter());
    }

    public static Double sphereSquare(Double r) {
        double pi = 3.14;
        return (double) 4 * pi * Math.pow(r, 2);
    }

    public static Double earthSquare() {
        return sphereSquare(6371.2);
    }

    public static Double mercurySquare() {
        return sphereSquare(2439.7);
    }

    public static Double jupiterSquare() {
        return sphereSquare((double) 71492);
    }

    public static Double earthVsMercury() {
        return earthSquare() / mercurySquare();
    }

    public static Double earthVsJupiter() {
        return earthSquare() / jupiterSquare();
    }
}