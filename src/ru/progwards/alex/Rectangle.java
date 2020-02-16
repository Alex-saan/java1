package ru.progwards.alex;


import java.math.BigDecimal;

public class Rectangle {

    //    private double a;
//    private double b;
//
//    public Rectangle(double a, double b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    public double area() {
//        return a * b;
//    }
//
//    public int compareTo(Rectangle anRectangle) {
//        if (this.area() > anRectangle.area())
//            return 1;
//        if (this.area() < anRectangle.area())
//            return -1;
//        else
//            return 0;
//    }
//
//    public static void main(String[] args) {
//        Rectangle anRectangle = new Rectangle(2, 2);
//        Rectangle anRectangle1 = new Rectangle(3, 2);
//        anRectangle.compareTo(anRectangle1);
//    }
    Rectangle(BigDecimal a, BigDecimal b) {
        this.a = a;
        this.b = b;
    }

    public BigDecimal a;
    public BigDecimal b;

    public BigDecimal area(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    boolean rectCompare(Rectangle r1, Rectangle r2) {
        return r1.a.multiply(r1.b) == r2.a.multiply(r2.b);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(new BigDecimal("1"), new BigDecimal("2"));
        Rectangle r2 = new Rectangle(new BigDecimal("2"), new BigDecimal("3"));
    }
}