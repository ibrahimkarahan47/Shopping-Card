package com.trendyol.codecase.entity;

import javax.persistence.*;

@Entity
@Table(name = "campaign_info")
public class CampaignInfo {
    @Id
    @GeneratedValue
    private int id;
    private String categoryInfo;
    private double discountAmount;
    private int productQuantity;
    private String type;

    @Basic
    @Column
    public String getCategoryInfo() {
        return categoryInfo;
    }

    public void setCategoryInfo(String categoryInfo) {
        this.categoryInfo = categoryInfo;
    }

    @Basic
    @Column
    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Basic
    @Column
    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Basic
    @Column
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
