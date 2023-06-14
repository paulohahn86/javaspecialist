package com.algaworks.crm.rent.model;

import java.util.Objects;

public class Location {

    private Notebook notebook;
    private Pricing pricing;

    private Insurance insurance;

    public Location(Notebook notebook, Pricing pricing) {
        Objects.requireNonNull(notebook);
        Objects.requireNonNull(pricing);
        this.notebook = notebook;
        this.pricing = pricing;
    }

    public Location(Notebook notebook, Pricing pricing, Insurance insurance) {
        this(notebook,pricing);
        this.insurance = insurance;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public boolean hasInsurance(){
        return getInsurance() != null;
    }

    public double calculateDueValue(int hoursUsed){
        double totalValue = getPricing().calculateValueTotal(getNotebook(), hoursUsed);

        if(hasInsurance()){
            totalValue += getInsurance().calculatePremium(hoursUsed, totalValue);
        }

        return totalValue;
    }


}
