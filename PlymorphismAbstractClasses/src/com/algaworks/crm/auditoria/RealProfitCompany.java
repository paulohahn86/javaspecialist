package com.algaworks.crm.auditoria;

public class RealProfitCompany extends JuridicalPerson {

    public static final double PROFIT_TAX_RATE = 0.25;

    public RealProfitCompany(String name, double annualIncome, double annualExpenditure) {
        super(name, annualIncome, annualExpenditure);
    }

    @Override
    public double CalculateTax() {
        return getAnnualProfit() * PROFIT_TAX_RATE;
    }
}
