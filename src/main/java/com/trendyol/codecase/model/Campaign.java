package com.trendyol.codecase.model;

public class Campaign {
    private String categoryInfo;
    private double discountAmount;
    private int productQuantity;
    private String type;

    public Campaign(String categoryInfo, double discountAmount, int productQuantity, String type) {
        this.categoryInfo = categoryInfo;
        this.discountAmount = discountAmount;
        this.productQuantity = productQuantity;
        this.type = type;
    }

    public Campaign() {
    }

    public String getCategoryInfo() {
        return categoryInfo;
    }

    public void setCategoryInfo(String categoryInfo) {
        this.categoryInfo = categoryInfo;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
