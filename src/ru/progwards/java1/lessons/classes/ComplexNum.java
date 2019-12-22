package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a;
    int b;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + "+" + b + "i";
    }

    public ComplexNum add(ComplexNum num) {
        return new ComplexNum(this.a + num.a, this.b + num.b);
    }

    public ComplexNum sub(ComplexNum num) {
        return new ComplexNum(this.a - num.a, this.b - num.b);
    }

    public ComplexNum mul(ComplexNum num) {
        return new ComplexNum((this.a * num.a - this.b * num.b), (this.b * num.a + this.a * num.b));
    }

    public ComplexNum div(ComplexNum num) {
        return new ComplexNum((this.a * num.a + this.b * num.b) / (num.a * num.a + num.b * num.b),
                ((this.b * num.a - this.a * num.b) / (num.a * num.a + num.b * num.b)));
    }

    public static void main(String[] args) {
        ComplexNum num = new ComplexNum(1, 1);
        ComplexNum num1 = new ComplexNum(2, 2);
        System.out.println(num.sub(num1).toString());
    }
}