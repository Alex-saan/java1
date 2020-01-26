package ru.progwards.java1.lessons.interfaces;

public class Animal implements FoodCompare, CompareWeight, Comparable<Animal> {

    double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeight) {
        if (getWeight() == ((Animal) smthHasWeight).getWeight())
            return CompareResult.EQUAL;
        if (getWeight() < ((Animal) smthHasWeight).getWeight())
            return CompareResult.LESS;
        return CompareResult.GREATER;
    }
//    public CompareResult compareWeight(CompareWeight smthHasWeight){
//        switch (compareTo()){
//            case 0: return EQUAL;
//
//        }
//    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) return true;
        if (anObject == null || anObject.getClass() != getClass()) return false;
        Animal an = (Animal) anObject;
        return Double.compare(this.weight, an.weight) == 0;
    }

    public double getFood1kgPrice() {
        switch (getFoodKind()) {
            case HAY:
                return 20;
            case CORN:
                return 50;
            case UNKNOWN:
                return 0;
        }
        return 0;
    }

    public double getFoodPrice() {
        return calculateFoodWeight() * getFood1kgPrice();
    } // О цене еды

    public double compareWeigt(Animal animal) {
        return Double.compare(this.weight, animal.weight);
    }

    public int compareFoodPrice(Animal animal) {
        return Double.compare(this.getFoodPrice(), animal.getFoodPrice());
    } // Сравнение цены еды

    public static void printinfo(Animal animal) {
        System.out.println(animal.toString());
    }

    public double getWeight() {
        return weight;
    }

    public double getFoodCoeff() {
        return 0.02;
    }

    public double calculateFoodWeight() {
        return weight * getFoodCoeff();
    }

    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    @Override
    public int compareTo(Animal animal) {
        if(this.getWeight() == animal.getWeight())
            return 0;
        if (this.getWeight() < animal.getWeight())
            return -1;
        return 1;
    }

    enum AnimalKind {
        ANIMAL, COW, HAMSTER, DUCK
    }

    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    enum FoodKind {
        UNKNOWN, HAY, CORN
    }

    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind();
    }

    public String toStringFull() {
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }
}

class Cow extends Animal {

    Cow(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.COW;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.HAY;
    }

    @Override
    public double getFoodCoeff() {
        return 0.05;
    }
}

class Hamster extends Animal {
    Hamster(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
    }

    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        return 0.03;
    }
}

class Duck extends Animal {
    Duck(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.DUCK;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        return 0.04;
    }

    public static void main(String[] args) {

        Cow b = new Cow(55.55);
        Hamster h = new Hamster(1.1);
        Duck u = new Duck(3.3);

        System.out.println(h.weight);
//        printinfo(b);
//        printinfo(h);
//        printinfo(u);
    }


}