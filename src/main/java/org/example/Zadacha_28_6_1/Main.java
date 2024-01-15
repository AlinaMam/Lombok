package org.example.Zadacha_28_6_1;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("1", "2");
        System.out.println(order1);
        Order order2 = new Order.OrderBuilder().build();
        System.out.println(order2);

    }
}
