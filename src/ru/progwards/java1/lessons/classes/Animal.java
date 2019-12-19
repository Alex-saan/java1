package ru.progwards.java1.lessons.classes;

public class Animal {
    public static void main(String[] args) {

        Cow b = new Cow(55.55);
        Hamster h = new Hamster(1.1);
        Duck u = new Duck(3.3);
        printinfo(b);
        printinfo(h);
        printinfo(u);
    }
    public static void printinfo (Animal animal){
        System.out.println(animal.toString());
        System.out.println(animal.toStringFull());

    }

    double weight;

    public Animal(double weight) {
        this.weight = weight;
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
}
