package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static void main(String[] args) {
        double radius = 6371.2;
        volumeBallDouble(radius);
        volumeBallFloat((float) radius);
        calculateAccuracy(radius);
    }

    public static double volumeBallDouble(double radius) {
        return ((double) 4 / 3) * 3.14 * Math.pow(radius, 3);
    }

    public static float volumeBallFloat(float radius) {
        return ((float) 4 / 3) * (float) 3.14 * (float) Math.pow(radius, 3);
    }

    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius) - volumeBallFloat((float) radius);
    }
}