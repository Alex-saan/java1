package ru.progwards.java1.lessons.queues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class OrderQueue {

    Comparator<Order> com = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return Integer.compare(o1.getPrior(), o2.getPrior());
        }
    };

    Comparator<Order> com1 = new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return Integer.compare(o1.getNum(), o2.getNum());
        }
    };
    PriorityQueue pQ = new PriorityQueue(com.thenComparing(com1));

    public void add(Order order) {
        pQ.offer(order);
    }
    public Order get(){
        if(pQ.isEmpty()){
            return null;
        }
        return (Order) pQ.poll();
    }

    public static void main(String[] args) {
        OrderQueue oQ = new OrderQueue();
        oQ.add(new Order(1000));
        oQ.add(new Order(20000));
        oQ.add(new Order(10000));
        oQ.add(new Order(30000));
        oQ.add(new Order(15000));
        oQ.add(new Order(1000));
        oQ.add(new Order(50000));
        oQ.add(new Order(1000));
        while (!oQ.pQ.isEmpty()) {
            System.out.println(oQ.pQ.poll());
        }
        //System.out.println(oQ.get());
    }
}