package com.trendyol.codecase.model;

public class Product {

    private String title;
    private double price;
    private String category;

    public Product() {
    }

    public Product(String title, double price, String category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
