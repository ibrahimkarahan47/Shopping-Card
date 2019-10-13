package com.trendyol.codecase.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ShoppingCart {
    private ArrayList<Product> productList;
    private int categoryNumber;
    private int distinctProductNumber;
    private double totalAmount = 0.0;
    private double appliedDiscount = 0.0;

    public ShoppingCart() {
        productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public int getCategoryNumber() {
        return categoryNumber;
    }

    public void setCategoryNumber(int categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public int getDistinctProductNumber() {
        return distinctProductNumber;
    }

    public void setDistinctProductNumber(int distinctProductNumber) {
        this.distinctProductNumber = distinctProductNumber;
    }

    public void addItem(Product obj, int quantity){
        while(quantity != 0){
            productList.add(obj);
            quantity--;
        }
    }


    public void countDistinctProductNumber(){
        Set<String> productSet = new HashSet<String>();
        this.productList.forEach((product)->productSet.add(product.getTitle()));
        this.setDistinctProductNumber(productSet.size());
    }

    public void countCategoryNumber(){
        Set<String> categorySet = new HashSet<String>();
        this.productList.forEach((product)->categorySet.add(product.getCategory()));
        this.setCategoryNumber(categorySet.size());
    }

    public double getTotalAmountWithoutDiscount(ShoppingCart cart) {
        double totalSumWithoutDiscount = 0.0;
        for (Product product : cart.getProductList()){
            totalSumWithoutDiscount = totalSumWithoutDiscount + product.getPrice();
        }
        return totalSumWithoutDiscount;
    }

    public void applyDiscount(double discount1,double discount2){
        appliedDiscount = Math.max(discount1,discount2);
    }

    public double getTotalAmountAfterDiscount(){
        return this.totalAmount - this.appliedDiscount;
    }

    public double getCampaignDiscount(){
        return this.appliedDiscount;
    }

}
