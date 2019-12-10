package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static void main(String[] args) {
        double radius = 6371.2;

        volumeBallDouble(radius);
        volumeBallFloat((float) radius);
        calculateAccuracy(volumeBallDouble(radius), volumeBallFloat((float) radius));
    }

    public static double volumeBallDouble(double radius) {
        return ((double) 4 / 3) * 3.14 * Math.pow(radius, 3);
    }

    public static float volumeBallFloat(float radius) {
        return (float) (((float) 4 / 3) * 3.14 * Math.pow(radius, 3));
    }

    public static double calculateAccuracy(double x, double y) {
        return volumeBallDouble(x) - volumeBallFloat((float) y);
    }
}
