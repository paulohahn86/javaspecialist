package com.algaworks.crm.auditoria;

public class SimpleCompany extends JuridicalPerson {

    public static final double INVOICE_TAX_RATE = 0.06;

    public SimpleCompany(String name, double annualIncome, double annualExpenditure) {
        super(name, annualIncome, annualExpenditure);
    }

    @Override
    public double CalculateTax() {
        return getAnnualIncome() * INVOICE_TAX_RATE;
    }
}
