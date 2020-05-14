package ru.progwards.java1.lessons.queues;

public class SortOut implements Comparable<SortOut> {
    private String name;
    private long time;

    public SortOut(String name, long time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public int compareTo(SortOut o) {
        if (time == o.time) {
            return name.compareTo(o.name);
        } else return Long.compare(time, o.time);
    }

    @Override
    public String toString() {
        return name + ", ";

    }
}