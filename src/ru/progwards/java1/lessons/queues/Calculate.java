package ru.progwards.java1.lessons.queues;

public class Calculate {
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
}