package com.algaworks.crm.rent.model;

public class PricingPerDay implements Pricing {

    @Override
    public double calculateValueTotal(Notebook notebook, int hoursUsed) {
        double dias = Math.ceil(hoursUsed / 24d);
        return notebook.getPricePerDay() * dias;
    }
}
