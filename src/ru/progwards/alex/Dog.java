package ru.progwards.alex;

public class Dog implements Speaking, Eating {
    @Override
    public String say() {
        return "Гав";
    }

    @Override
    public String eat() {
        return "Мясо";
    }
}