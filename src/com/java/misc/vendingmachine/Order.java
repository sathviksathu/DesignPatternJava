package com.java.misc.vendingmachine;

public class Order {
    private int productId;
    private int requestedQuantity;
    private float inserted_amt;
    private float order_amt;
    private float change;

    public Order(int productId, int requestedQuantity, float inserted_amt) {
        this.productId = productId;
        this.requestedQuantity = requestedQuantity;
        this.inserted_amt = inserted_amt;
    }

    public int getProductId() {
        return productId;
    }

    public int getRequestedQuantity() {
        return requestedQuantity;
    }

    public float getInserted_amt() {
        return inserted_amt;
    }

    public float getOrder_amt() {
        return order_amt;
    }

    public float getChange() {
        return change;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setRequestedQuantity(int requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public void setInserted_amt(float inserted_amt) {
        this.inserted_amt = inserted_amt;
    }

    public void setOrder_amt(float order_amt) {
        this.order_amt = order_amt;
    }

    public void setChange(float change) {
        this.change = change;
    }
}
