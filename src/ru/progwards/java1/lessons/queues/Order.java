package ru.progwards.java1.lessons.queues;

class Order {
    private double sum;
    private static int num;
    private int prior;
    private int doNum;

    public Order(double sum) {
        this.sum = sum;
        num++;
        doNum = num;
        if (sum > 20000) {
            prior = 1;
        }
        if (sum > 10000 && sum <= 20000) {
            prior = 2;
        }
        if (sum <= 10000) {
            prior = 3;
        }
    }

    public double getSum() {
        return sum;
    }

    public int getNum() {
        return doNum;
    }

    public int getPrior() {
        return prior;
    }

    @Override
    public String toString() {
        return "Order{" +
                "sum=" + sum +
                ", num=" + doNum +
                ", prior=" + prior +
                '}';
    }
}