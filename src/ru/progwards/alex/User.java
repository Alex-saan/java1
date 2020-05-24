package ru.progwards.alex;

import java.util.Comparator;
import java.util.TreeSet;

public class User {

    public Integer id;
    public String name;

    User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public TreeSet<User> createSet(){
        TreeSet<User> treeSet = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o2.id, o1.id);
                //return (o1.id < o2.id) ? 1 : ((o1.id == o2.id) ? 0 : -1);
            }
        });

        treeSet.add(new User(11, "migel"));
        treeSet.add(new User(7, "vovan"));
        treeSet.add(new User(8, "fritz"));
        return treeSet;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}