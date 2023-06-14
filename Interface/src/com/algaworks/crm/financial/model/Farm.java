package com.algaworks.crm.financial.model;

public class Farm extends FinancialCompany {

    public static final double CREDIT_LIMIT_INVOICING_PERCENTAGE = 0.5;
    public static final double CAP_INCREASE_RATE_FOR_LARGE_PROPERTY = 1.2;
    public static final double MINIMUM_SIZE_IN_HECTARES_LARGE_PROPERTY = 5;
    private double sizeHectares;

    public Farm(String socialReason, double totalBilling, double sizeHectares) {
        super(socialReason, totalBilling);
        this.sizeHectares = sizeHectares;
    }

    public double getSizeHectares() {
        return sizeHectares;
    }

    public void setSizeHectares(double sizeHectares) {
        this.sizeHectares = sizeHectares;
    }

    @Override
    public double calculateApprovedLimit() {
        double approvedLimit = getTotalBilling() * CREDIT_LIMIT_INVOICING_PERCENTAGE;

        if (getSizeHectares() >= MINIMUM_SIZE_IN_HECTARES_LARGE_PROPERTY){
            approvedLimit *= CAP_INCREASE_RATE_FOR_LARGE_PROPERTY;
        }

        return approvedLimit;
    }
}
