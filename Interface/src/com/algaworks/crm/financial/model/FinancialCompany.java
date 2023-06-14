package com.algaworks.crm.financial.model;

public abstract class FinancialCompany extends Company implements FinancialClient {

    public FinancialCompany(String socialReason, double totalBilling) {
        super(socialReason, totalBilling);
    }


    @Override
    public double calculateRates(double requestedValue) {
        return 0.8;
    }
}
