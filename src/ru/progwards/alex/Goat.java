package ru.progwards.alex;

public class Goat implements Speaking, Eating {
    public String say() {
        return "Мее";
    }

    public String eat() {
        return "Сено";
    }
}