package com.example.nfcgnjava232shopservice.shop;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopService {

    private ProductRepository productRepository;
    private OrderRepository orderRepository;

    public ShopService(ProductRepository productRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public Product getProduct(String id) {
        return this.productRepository.get(id);
    }

    public List<Product> listProducts() {
        return this.productRepository.list();
    }

    public Order getOrder(String id) {
        return this.orderRepository.get(id);
    }

    public List<Order> listOrders() {
        return this.orderRepository.list();
    }

    public List<Order> addOrder(String orderId, String[] productIds) {

        Order newOrder = new Order(orderId, new ArrayList<>());

        for (int i = 0; i < productIds.length; i++) {
            Product productToAdd = productRepository.get(productIds[i]);

            if (productToAdd != null) {
                newOrder.getProducts().add(productToAdd);
            }
        }

        return this.orderRepository.add(newOrder);
    }


}
