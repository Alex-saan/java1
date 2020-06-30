package ru.progwards.java1.lessons.files;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    public String shopId;

    public String orderId;

    public String customerId;

    public LocalDateTime dateTime;

    public List<OrderItem> items;

    public double sum;

    @Override
    public String toString() {
        return "Order{" +
                "shopId='" + shopId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", datetime=" + dateTime +
                ", items=" + items +
                ", sum=" + sum +
                '}';
    }
}