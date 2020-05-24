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
        StackCalc x = new StackCalc();
        x.push(19.0);
        x.push(3.33);
        x.sub();
        x.push(13.001);
        x.push(9.2);
        x.sub();
        x.push(2.0);
        x.mul();
        x.push(87);
        x.add();
        x.mul();
        x.push(737.22);
        x.push(24);
        x.add();
        x.push(55.6);
        x.push(12.1);
        x.sub();
        x.div();
        x.add();
        return x.pop();
    }

    public static void main(String[] args) {
        calculation2();
        calculation1();
    }
}