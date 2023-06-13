package com.example.nfcgnjava232shopservice.shop;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {


    private List<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();

        //Dummy product
        this.products.add(new Product("1", "Wholegrain Milk"));
    }

    public ProductRepository(List<Product> products) {
        this.products = products;
    }

    public Product get(String id) {

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                return products.get(i);
            }
        }
        return null;
    }

    public List<Product> list() {
        return this.products;
    }
}
