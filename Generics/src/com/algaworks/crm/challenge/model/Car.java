package com.algaworks.crm.challenge.model;

public class Car implements Stock {

    private String model;
    private int stockQuantity;

    public Car(String model, int stockQuantity) {
        this.model = model;
        this.stockQuantity = stockQuantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public int getStockQuantity() {
        return stockQuantity;
    }


}
