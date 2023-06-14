package com.algaworks.crm.rent.model;

public class Notebook {

    private String description;
    private double pricePerHour;
    private double pricePerDay;

    public Notebook(String description, double pricePerHour, double pricePerDay) {
        this.description = description;
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
