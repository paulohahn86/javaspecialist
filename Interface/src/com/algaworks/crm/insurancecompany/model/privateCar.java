package com.algaworks.crm.insurancecompany.model;

public class privateCar extends AutomotiveVehicle {

    public privateCar(String model, double marketValue, int fabricationYear) {
        super(model, marketValue, fabricationYear);
    }


    public double calculatePremiumValue() {
        double premiumValue = getMarketValue() * 0.04;

        if(getFabricationYear() < 2000){
            premiumValue += premiumValue * 0.05;
            return premiumValue;
        }

        return premiumValue;
    }

    public String description() {
        return "Private car " + getModel() + ", year " + getFabricationYear() + ", vakued at " + String.format("%.2f" , getMarketValue());
    }
}
