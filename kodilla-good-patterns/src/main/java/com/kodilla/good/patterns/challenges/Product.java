package com.kodilla.good.patterns.challenges;

public class Product {
    private String nameProduct;
    private double price;

    public Product(String nameProduct, double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPrice() {
        return price;
    }
}
