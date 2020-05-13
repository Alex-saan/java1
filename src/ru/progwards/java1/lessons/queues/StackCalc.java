package ru.progwards.java1.lessons.queues;

import java.util.ArrayDeque;

public class StackCalc {

    ArrayDeque<Double> arrayDeque = new ArrayDeque<>();

    public void push(double value) {
        arrayDeque.push(value);
    }

    public double pop() {
        return arrayDeque.pop();
    }

    public void add() {
        Double x = arrayDeque.pop() + arrayDeque.pop();
        arrayDeque.push(x);
    }

    public void sub() {
        Double x = arrayDeque.pop();
        Double y = arrayDeque.pop() - x;
        arrayDeque.push(y);
    }

    public void mul() {
        Double x = arrayDeque.pop() * arrayDeque.pop();
        arrayDeque.push(x);
    }

    public void div() {
        Double x = arrayDeque.pop();
        Double y = arrayDeque.pop() / x;
        arrayDeque.push(y);
    }

    public static void main(String[] args) {
        //System.out.println(calculation2());
    }
}