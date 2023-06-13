package com.example.nfcgnjava232shopservice.shop;

import java.util.List;

public class Order {


    private String id;
    private List<Product> products;

    public Order(String id, List<Product> products) {
        this.id = id;
        this.products = products;
    }

    public String getId() {
        return this.id;
    }

    public List<Product> getProducts() {
        return this.products;
    }
}
