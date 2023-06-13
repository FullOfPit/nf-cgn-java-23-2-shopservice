package com.example.nfcgnjava232shopservice.shop;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private List<Order> orders;

    public OrderRepository() {
        this.orders = new ArrayList<>();
    }

    public OrderRepository(List<Order> orders) {
        this.orders = orders;
    }

    public Order get(String id) {

        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId().equals(id)) {
                return orders.get(i);
            }
        }
        return null;
    }

    public List<Order> list() {
        return this.orders;
    }

    public List<Order> add(Order newOrder) {

        if (this.orders.contains(newOrder)) {
            throw new IllegalArgumentException();
        }

        this.orders.add(newOrder);
        return this.orders;
    }
}
