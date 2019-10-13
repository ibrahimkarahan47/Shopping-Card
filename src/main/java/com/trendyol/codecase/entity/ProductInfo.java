package com.trendyol.codecase.entity;

import javax.persistence.*;

@Entity
@Table(name = "Product_info")
public class ProductInfo {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private double price;
    private String categoryInfo;

    @Basic
    @Column
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column
    public String getCategoryInfo() {
        return categoryInfo;
    }

    public void setCategoryInfo(String categoryInfo) {
        this.categoryInfo = categoryInfo;
    }
}
