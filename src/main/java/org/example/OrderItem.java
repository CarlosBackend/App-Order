package org.example;

public class OrderItem {
    private int quantity;
    private Double price;

    public OrderItem(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }
    public OrderItem() {

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
