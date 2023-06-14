package com.algaworks.crm.financial.model;

public class FinancialPartner extends Company {

    private double totalAmountApplied;

    public FinancialPartner(String socialReason, double totalBilling, double totalAmountApplied) {
        super(socialReason, totalBilling);
        this.totalAmountApplied = totalAmountApplied;
    }

    public double getTotalAmountApplied() {
        return totalAmountApplied;
    }

    public void addNewApplication(double valueApplied){
        totalAmountApplied += valueApplied;
    }


}
