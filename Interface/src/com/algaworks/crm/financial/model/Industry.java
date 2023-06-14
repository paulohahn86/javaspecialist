package com.algaworks.crm.financial.model;

public class Industry extends FinancialCompany {

    public static final double CREDIT_LIMIT_INVOICING_PERCENTAGE = 0.5;
    public static final double SUSTAINABLE_INDUSTRY_INCREASE_LIMIT = 1.2;
    private boolean compensatesCo2Emissions;

    public Industry(String socialReason, double totalBilling, boolean compensatesCo2Emissions) {
        super(socialReason, totalBilling);
        this.compensatesCo2Emissions = compensatesCo2Emissions;
    }

    public boolean isCompensatesCo2Emissions() {
        return compensatesCo2Emissions;
    }

    public void setCompensatesCo2Emissions(boolean compensatesCo2Emissions) {
        this.compensatesCo2Emissions = compensatesCo2Emissions;
    }

    @Override
    public double calculateApprovedLimit() {
        double approvedValue = getTotalBilling() * CREDIT_LIMIT_INVOICING_PERCENTAGE;

        if(isCompensatesCo2Emissions()){
            approvedValue *= SUSTAINABLE_INDUSTRY_INCREASE_LIMIT;
        }

        return approvedValue;
    }
}
