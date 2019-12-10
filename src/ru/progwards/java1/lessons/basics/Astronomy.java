package ru.progwards.java1.lessons.basics;

public class Astronomy {

    public static void main(String[] args) {
        double eR = 6371.2;
        double mR = 2439.7;
        double jR = 71492;
        earthSquare(eR);
        mercurySquare(mR);
        jupiterSquare(jR);
        earthVsMercury(earthSquare(eR), mercurySquare(mR));
        earthVsJupiter(earthSquare(eR), jupiterSquare(jR));
    }

    public static Double sphereSquare(Double r) {
        double pi = 3.14;
        return 4 * pi * Math.pow(r, 2);
    }

    public static Double earthSquare(Double r) {
        return sphereSquare(r);
    }

    public static Double mercurySquare(Double r) {
        return sphereSquare(r);
    }

    public static Double jupiterSquare(Double r) {
        return sphereSquare(r);
    }

    public static Double earthVsMercury(double x, double y) {
        return earthSquare(x) / mercurySquare(y);
    }

    public static Double earthVsJupiter(double x, double y) {
        return earthSquare(x) / jupiterSquare(y);
    }
}