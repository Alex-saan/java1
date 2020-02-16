package ru.progwards.alex;

public class NPE {

    public Integer sqr(Integer n) {
        try {
            return n * n;
        }
        catch (NullPointerException e){
            return -1;
        }
    }
}
