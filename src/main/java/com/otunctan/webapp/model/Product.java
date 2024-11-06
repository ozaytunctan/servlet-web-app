package com.otunctan.webapp.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {

    private String name;

    private String categoryName;

    private BigDecimal basePrice;

    private BigDecimal quantity;


    public Product() {
    }

    public Product(String name, String category, BigDecimal basePrice, BigDecimal quantity) {
        this.name=name;
        this.categoryName=category;
        this.basePrice =basePrice;
        this.quantity=quantity;
    }

    public static Product of(String name, String category, BigDecimal basePrice, BigDecimal quantity) {
        return new Product(name,category,basePrice,quantity);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
}
