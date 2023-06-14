package com.algaworks.crm.challenge.model;

public class Clothes implements Stock {

    private String description;
    private int stockQuantity;

    public Clothes(String description, int stockQuantity) {
        this.description = description;
        this.stockQuantity = stockQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    @Override
    public int getStockQuantity() {
        return stockQuantity;
    }


}
