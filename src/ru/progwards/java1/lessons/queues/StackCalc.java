package ru.progwards.java1.lessons.queues;

import java.util.ArrayDeque;

public class StackCalc {
    public double value;

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

    public static double calculation1() {
        StackCalc stackCalc = new StackCalc();
        stackCalc.push(2.2);
        stackCalc.push(12.1);
        stackCalc.push(3);
        stackCalc.add();
        stackCalc.mul();
        return stackCalc.pop();
    }

    //(737.22+24)/(55.6-12.1)+(19-3.33)*(87+2*(13.001-9.2))
    public static double calculation2() {
        StackCalc stackCalc = new StackCalc();
        stackCalc.push(737.22);
        stackCalc.push(24);
        stackCalc.add();
        stackCalc.push(55.6);
        stackCalc.push(12.1);
        stackCalc.sub();
        stackCalc.div();

//        stackCalc.push();
//        stackCalc.push();
//        stackCalc.push();
//        stackCalc.push();
//        stackCalc.push();
//        stackCalc.push();
//        stackCalc.push();
//        stackCalc.push();


        return stackCalc.pop();
    }

    public static void main(String[] args) {
        //System.out.println(calculation2());
    }
}