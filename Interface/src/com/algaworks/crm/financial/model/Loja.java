package com.algaworks.crm.financial.model;

public class Loja extends FinancialCompany {

    public static final double CREDIT_LIMIT_INVOICING_PERCENTAGE = 0.2;
    public static final double CREDIT_LIMIT_STOCK_VALUE = 0.5;
    private double totalStockValue;

    public Loja(String socialReason, double totalBilling, double totalStockValue) {
        super(socialReason, totalBilling);
        this.totalStockValue = totalStockValue;
    }

    public double getTotalStockValue() {
        return totalStockValue;
    }

    public void setTotalStockValue(double totalStockValue) {
        this.totalStockValue = totalStockValue;
    }

    @Override
    public double calculateApprovedLimit() {
        return (getTotalBilling() * CREDIT_LIMIT_INVOICING_PERCENTAGE)
                + (getTotalStockValue() * CREDIT_LIMIT_STOCK_VALUE);
    }
}
