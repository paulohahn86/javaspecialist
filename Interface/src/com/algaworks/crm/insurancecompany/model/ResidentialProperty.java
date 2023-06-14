package com.algaworks.crm.insurancecompany.model;

public class ResidentialProperty implements Secure {

    private double marketValue;
    private int constructedArea;

    public ResidentialProperty(double marketValue, int constructedArea) {
        this.marketValue = marketValue;
        this.constructedArea = constructedArea;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    public int getConstructedArea() {
        return constructedArea;
    }

    public void setConstructedArea(int constructedArea) {
        this.constructedArea = constructedArea;
    }

    @Override
    public double calculatePremiumValue() {
        return getMarketValue() * 0.001 + getConstructedArea() * 0.3;
    }

    @Override
    public String description() {

        return "Residential Property with " + getConstructedArea() + " m2 of built area, valued at R$ " + String.format("%.2f" , getMarketValue());
    }
}
