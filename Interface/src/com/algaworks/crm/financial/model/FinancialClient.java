package com.algaworks.crm.financial.model;

public interface FinancialClient {

    public static final double LOW_RISK_INTEREST = 1.0;
    public static final double INTEREST_MEDIUM_RISK = 1.5;
    public static final double INTEREST_HIGH_RISK = 2.0;

    public abstract double calculateApprovedLimit();

    default double calculateRates(double requestedValue){
        if(isFinancialSmallValue(requestedValue)){
            return LOW_RISK_INTEREST;
        }else if(isFinancialLargeValue(requestedValue)){
            return INTEREST_MEDIUM_RISK;
        }
        return INTEREST_HIGH_RISK;
    }

    private static boolean isFinancialLargeValue(double requestedValue) {
        return requestedValue <= 1000000;
    }

    private static boolean isFinancialSmallValue(double requestedValue) {
        return requestedValue <= 100000;
    }

}
