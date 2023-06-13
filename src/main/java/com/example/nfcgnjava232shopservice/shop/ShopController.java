package com.example.nfcgnjava232shopservice.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShopController {

    private ShopService shopService;

    @Autowired
    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return this.shopService.listProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable String id) {
        return this.shopService.getProduct(id);
    }

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return this.shopService.listOrders();
    }

    @GetMapping("/orders/{id}")
    public Order getOrder(@PathVariable String id) {
        return this.shopService.getOrder(id);
    }

    @PostMapping("/orders/{id}")
    public List<Order> addOrder(@PathVariable String id, @RequestBody String[] productIds) {
        String orderId = id;
        return this.shopService.addOrder(orderId, productIds);
    }
}
