package com.algaworks.crm.challenge.model;

public class ManagerStock<T extends Stock> {

    int stockQuantity;

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void add(T item){
        stockQuantity += item.getStockQuantity();
    }


}
