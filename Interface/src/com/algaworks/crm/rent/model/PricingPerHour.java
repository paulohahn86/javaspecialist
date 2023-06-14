package com.algaworks.crm.rent.model;

public class PricingPerHour implements Pricing {
    @Override
    public double calculateValueTotal(Notebook notebook, int hoursUsed) {
        return notebook.getPricePerHour() * hoursUsed;
    }
}
