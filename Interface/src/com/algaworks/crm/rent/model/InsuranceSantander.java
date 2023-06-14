package com.algaworks.crm.rent.model;

public class InsuranceSantander implements Insurance {
    @Override
    public double calculatePremium(int hoursUsed, double contractValue) {
        return (hoursUsed * 0.50) + (contractValue * 0.05);
    }
}
