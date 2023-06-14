package com.algaworks.crm.rent.model;

public class InsuranceItau implements Insurance {
    @Override
    public double calculatePremium(int hoursUsed, double contractValue) {
        double dias = Math.ceil(hoursUsed / 24d);

        return dias * 5;
    }
}
