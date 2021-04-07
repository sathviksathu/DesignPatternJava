package com.java.design.patterns;

public class Product {
    int productId;
    String productName;
    int availableQuanity;
    float unitPrice;
    Location location;

    public Product(int productId, String productName, int availableQuanity, float unitPrice) {
        this.productId = productId;
        this.productName = productName;
        this.availableQuanity = availableQuanity;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getAvailableQuanity() {
        return availableQuanity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public Location getLocation() {
        return location;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setAvailableQuanity(int availableQuanity) {
        this.availableQuanity = availableQuanity;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
