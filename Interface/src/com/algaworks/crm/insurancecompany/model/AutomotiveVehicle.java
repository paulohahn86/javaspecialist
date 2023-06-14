package com.algaworks.crm.insurancecompany.model;

public abstract class AutomotiveVehicle implements Secure {

    private String model;
    private double marketValue;
    private int fabricationYear;

    public AutomotiveVehicle(String model, double marketValue, int fabricationYear) {
        this.model = model;
        this.marketValue = marketValue;
        this.fabricationYear = fabricationYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }
}
