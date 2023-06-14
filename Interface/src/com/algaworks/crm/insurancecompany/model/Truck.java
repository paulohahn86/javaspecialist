package com.algaworks.crm.insurancecompany.model;

public class Truck extends AutomotiveVehicle {

    private int quantityAxes;

    public Truck(String model, double marketValue, int fabricationYear, int quantityAxes) {
        super(model, marketValue, fabricationYear);
        this.quantityAxes = quantityAxes;
    }

    public int getQuantityAxes() {
        return quantityAxes;
    }

    public void setQuantityAxes(int quantityAxes) {
        this.quantityAxes = quantityAxes;
    }

    @Override
    public double calculatePremiumValue() {
        return  getMarketValue() * 0.02 + getQuantityAxes() * 50;
    }

    @Override
    public String description() {
        return "Truck " + getModel() + ", year " + getFabricationYear() + ", " + getQuantityAxes() + " axes, valued at " + String.format("%.2f" , getMarketValue());
    }
}
