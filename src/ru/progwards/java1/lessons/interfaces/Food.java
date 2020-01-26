package ru.progwards.java1.lessons.interfaces;

public class Food implements CompareWeight {
    private int weight;

    Food(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
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

//    public CompareResult compareWeight(CompareWeight smthHasWeight){
//        return ((Animal)this.weight).compareTo((Animal)smthHasWeight)==0);
//    }

}

