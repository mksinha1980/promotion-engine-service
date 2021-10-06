package org.example.promotion.engine.service;

/**
 * This code is for product and their default values.
 *
 */

public class Product {
    public String id;
    public double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String id)
    {
        this.id = id;
        switch (id)
        {
            case "A":
                this.price = 50;

                break;
            case "B":
                this.price = 30;

                break;
            case "C":
                this.price = 20;

                break;
            case "D":
                this.price = 15;
                break;
        }
    }
}
