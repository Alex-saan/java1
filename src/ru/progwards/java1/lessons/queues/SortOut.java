package ru.progwards.java1.lessons.queues;

public class SortOut {
    private String name;
    private int time;

    public SortOut(String name, int time) {
        this.name = name;
        this.time = time;
    }
    public String getName(){
        return name;
    }
    public int getTime(){
        return time;
    }

    @Override
    public String toString() {
        return "SortOut{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
