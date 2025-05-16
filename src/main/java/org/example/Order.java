package org.example;

import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private Client client;
    private List<OrderItem> items = new java.util.ArrayList<>();

    public Order(Date moment, Client client) {
        this.moment = moment;
        this.client = client;
    }
    public Order() {

    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }
}
