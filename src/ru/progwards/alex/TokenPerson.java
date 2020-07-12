package ru.progwards.alex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TokenPerson {
    public String name;
    public Date birth;
    public double salary;

    TokenPerson(String name, Date birth, double salary) {
        this.name = name;
        this.birth = birth;
        this.salary = salary;
    }

    void printPersons(TokenPerson[] persons) throws ParseException {
        for (TokenPerson p : persons) {
                        System.out.format(new Locale("ru"), "|%-10s|%2$td/%2$tm/%2$tY|%3$,10.2f|\n", p.name, p.birth, p.salary);
        }
    }

    public static void main(String[] args) throws ParseException {
    }
}