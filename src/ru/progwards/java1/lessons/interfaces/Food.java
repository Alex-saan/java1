package ru.progwards.java1.lessons.interfaces;

public class Food implements CompareWeight {
    private int weight;

    Food(int weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeigt) {
        if (this.weight == ((Food) smthHasWeigt).weight)
            return CompareResult.EQUAL;
        if (this.weight < ((Food) smthHasWeigt).weight)
            return CompareResult.LESS;
        return CompareResult.GREATER;
    }
}