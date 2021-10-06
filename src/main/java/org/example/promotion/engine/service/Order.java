package org.example.promotion.engine.service;

import java.util.List;

public class Order {
    public int orderID;
    public List<Product> products;

    public Order(int orderID, List<Product> products)
    {
        this.orderID = orderID;
        this.products = products;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
