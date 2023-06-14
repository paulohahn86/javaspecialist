package com.algaworks.crm.auditoria;

public class PhysicalPerson extends Person {

    public static final double ANNUAL_REVENUE_ISENCAO = 50000;
    public static final double INCOME_TAX_RATE = 0.20;

    private double annualIncome;


    public PhysicalPerson(String name, double annualIncome) {
        super(name);
        this.annualIncome = annualIncome;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    @Override
    public double CalculateTax() {
        if(isExempted()){
            return 0;
        }
        return annualIncome * INCOME_TAX_RATE;
    }
    private boolean isExempted() {
        return getAnnualIncome() <= ANNUAL_REVENUE_ISENCAO;
    }
}
